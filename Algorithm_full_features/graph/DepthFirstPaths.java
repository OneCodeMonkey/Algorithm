/**
 * Run depth first search on an undirected graph.
 * Runs in O(E + V) time.
 *
 */
public class DepthFirstPaths {
	private boolean[] marked; 		// marked[v] = is there an s-v path?
	private int[] edgeTo;			// edgeTo[v] = last edge on s-v path
	private final int s;			// source vertex

	// Computes a path between `s` and every other vertex in graph `G`
	public DepthFirstPaths(Graph G, int s) {
		this.s = s;
		edgeTo = new int[G.V()];
		marked = new boolean[G.V()];
		validateVertex(s);
		dfs(G, s);
	}

	// depth first search from v
	private void dfs(Graph G, int v) {
		marked[v] = true;
		for(int w: G.adj(v)) {
			if(!marked[w]) {
				edgeTo[w] = v;
				dfs(G, w);
			}
		}
	}

	// is there a path between the source vertex `s` and vertex `v`
	public boolean hasPathTo(int v) {
		validateVertex(v);
		return marked[v];
	}

	// Returns a path between the source vertex `s` and the vertex `v`
	// return null if no such path.
	public Iterable<Integer> pathTo(int v) {
		validateVertex(v);
		if(!hasPathTo(v))
			return null;
		stack<Integer> path = new Stack<Integer>();
		for(int x = v; x != s; x = edgeTo[x])
			path.push(x);
		path.push(s);
		return path;
	}

	// throw an IllegalArgumentException unless `0 <= v < V`
	private void validateVertex(int v) {
		int V = marked.length;
		if(v < 0 || v >= V)
			throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
	}

	// tests
	public static void main(String[] args) {
		In in = new In(args[0]);
		Graph G = new Graph(in);
		int s = Integer.parseInt(args[1]);
		DepthFirstPaths dfs = new DepthFirstPaths(G, s);
		for(int v = 0; v < G.(); v++) {
			if(dfs.hasPathTo(v)) {
				StdOut.printf("%d to %d: ", s, v);
				for(int x:dfs.pathTo(v)) {
					if(x == s)
						StdOut.print(x);
					else
						StdOut.print("-" + x);
				}
			} else {
				StdOut.printf("%d to %d: not connected\n", s, v);
			}
		}
	}
}
