/**
 * Run breadth first search on an undirected graph.
 * Runs in O(E + V) time.
 *
 * The `BreadthFirstPaths` class represents a data type for finding shortest paths(number
 * of edges) from a source vertex `s` (or a set of source vertices) to every other vertex
 * in an undirected graph.
 * This implementation uses BFS search thoughts.
 *
 */
public class BreadthFirstPaths {
	private static final int INFINITY = Integer.MAX_VALUE;
	private boolean[] marked;		// marked[v] = is there an s-v path
	private int[] edgeTo;			// edgeTo[v] = previous edge on shortest s-v path
	private int[] distTo;			// distTo[v] = number of edges shortest s-v path

	// Computes the shortest path between the source vertex `s` and every other vertex in the
	// graph `G`
	public BreadthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V()];
		distTo = new int[G.V()];
		edgeTo = new int[G.V()];
		validateVertex(s);
		bfs(G, s);

		assert check(G, s);
	}

	// Computes the shortest path between any one of the source vertices in `sources` and 
	// every other vertex in graph `G`
	public BreadthFirstPaths(Graph G, Iterable<Integer>sources) {
		marked = new boolean[G.V()];
		distTo = new int[G.V()];
		edgeTo = new int[G.V()];
		for(int v = 0; v < G.V(); v++) {
			distTo[v] = INFINITY;
		}
		validateVertices(sources);
		bfs(G, sources);
	}

	// breadth-first search from a single source
	private void bfs(Graph G, int s) {
		Queue<Integer> q = new Queue<Integer>();
		for(int v = 0; v < G.V(); v++)
			distTo[v] = INFINITY;
		distTo[s] = 0;
		marked[s] = true;
		q.enqueue(s);

		while(!q.isEmpty()) {
			int v = q.dequeue();
			for(int w:G.adj(v)) {
				if(!marked[w]) {
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
					marked[w] = true;
					q.enqueue(w);
				}
			}
		}
	}

	// breadth-first search from multiple sources
	private void bfs(Graph G, Iterable<Integer> sources) {
		Queue<Integer> q = new Queue<Integer>();
		for(int s:sources) {
			marked[s] = true;
			distTo[s] = 0;
			q.enqueue(s);
		}
		while(!q.isEmpty()) {
			int v = q.dequeue();
			for(int w:G.adj(v)) {
				if(!marked[w]) {
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
					marked[w] = true;
					q.enqueue(w);
				}
			}
		}
	}

	// is there a path between the source vertex `s`(or sources) and vertex `v` ?
	public boolean hasPathTo(int v) {
		validateVertex(v);
		return marked[v];
	}

	// Returns the number of edges in a shortest path between the source vertex `s`(or sources) and
	// vertex `v`
	public int distTo(int v) {
		validateVertex(v);
		return distTo[v];
	}

	// Returns a shortest path between the source vertex `s`(or sources) and `v`, or `null`
	// if no such path.
	public Iterable<Integer> pathTo(int v) {
		validateVertex(v);
		if(!hasPathTo(v))
			return null;
		Stack<Integer> path = new Stack<Integer>();
		int x;
		for(x = v; distTo[x] != 0; x = edgeTo[x])
			path.push(x);
		path.push(x);
		return path;
	}

	// check optimality conditions for single soruce
	private boolean check(Graph G, int s) {
		// check that the distance of s = 0
		if(distTo[s] != 0) {
			StdOut.println("distance of source " + s + " to itself = " + distTo[s]);
			return false;
		}

		// check that for each edge v-w dist[w] <= dist[v] + 1
		// provided v is reachable from s
		for(int v = 0; v < G.V(); v++) {
			for(int w:G.adj(v)) {
				if(hasPathTo(v) != hasPathTo(w)) {
					StdOut.println("edge " + v + "-" + w);
					StdOut.println("hasPathTo(" + v + ") = " + hasPathTo(v));
					StdOut.println("hasPathTo(" + w + ") = " + hasPathTo(w));
					return false;
				}
				if(hasPathTo(v) && (distTo[w] > distTo[v] + 1)) {
					StdOut.println("edge " + v + "-" + w);
					StdOut.println("distTo[" + v + " ] = " + distTo[v]);
					StdOut.println("distTo[" + w + " ] = " + distTo[w]);
					return false;
				}
			}
		}

		// check that v = edgeTo[w] satisfies distTo[w] = distTo[v] + 1
		// provided v is reachable from s
		for(int w = 0; w < G.V(); w++) {
			if(!hasPathTo(w) || w == s)
				continue;
			int v = edgeTo[w];
			if(distTo[w] != distTo[v] + 1) {
				StdOut.println("shortest path edge " + v + "-" + w);
				StdOut.println("distTo[" + v + "] = " + distTo[v]);
				StdOut.println("distTo[" + w + "] = " + distTo[w]);
				return false;
			}
		}

		return true;
	}

	// throw an IllegalArgumentException unless `0 <= v < V`
	private void validateVertex(int v) {
		int V = marked.length;
		if(v < 0 || v >= V)
			throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
	}

	// throw an IllegalArgumentException unless `0 <= v < V`
	private void validateVertex(Iterable<Integer> vertices) {
		if(vertices == null)
			throw new IllegalArgumentException("argument is null");
		int V = marked.length;
		for(int V:vertices) {
			if(v < 0 || v >= V) {
				throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
			}
		}
	}

	// test
	public static void main(String[] args) {
		In in = new In(args[0]);
		Graph G = new Graph(in);

		int s = Integer.parseInt(args[1]);
		BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);
		for(int v = 0; v < G.V(); v++) {
			if(bfs.hasPathTo(v)) {
				StdOut.printf("%d to %d (%d): ", s, v, bfs.distTo(v));
				for(int x:bfs.pathTo(v)) {
					if(x == s)
						StdOut.print(x);
					else
						StdOut.print("-" + x);
				}
				StdOut.println();
			} else {
				StdOut.printf("%d to %d (-): not connected\n", s, v);
			}
		}
	}
}

