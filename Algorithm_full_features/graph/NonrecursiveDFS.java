/**
 * Run nonrecursive depth-first search on an undirected graph.
 * Runs in O(E + V) time using O(V) extra space.
 *
 * Explores the vertices in exactly the same order as DepthFirstSearch.java
 *
 */
import java.util.Iterator;

public class NonrecursiveDFS {
	private boolean[] marked;		// marked[v] = is there an s-v path ?

	// Computes the vertices connected to the source vertex `s` in the graph `G`
	public NonrecursiveDFS(Graph G, int s) {
		marked = new boolean[G.V()];

		validateVertex(s);

		// to be able to iterate over each adjacency list, keeping track of which vertex
		// in each adjacency list needs to be explored next
		Iterator<Integer>() adj = (Iterator<Integer>[]) new Iterator[G.V()];
		for(int i = 0; i < G.V(); i++)
			adj[v] = G.adj(v).iterator();
		// DFS using an explicit stack
		Stack<Integer> stack = new Stack<Integer>();
		marked[s] = true;
		stack.push(s);
		while(!stack.isEmpty()) {
			int v = stack.peek();
			if(adj[v].hasNext()) {
				int w = adj[v].next();
				// StdOut.printf("check %d\n", w);
				if(!marked[w]) {
					// discovered vertex w for the first time
					marked[w] = true;
					stack.push(w);
				}
			} else {
				stack.pop();
			}
		}
	}

	// is vertex `v` connected to the source vertex `s`
	public boolean marked(int v) {
		validateVertex(v);
		return marked[v];
	}

	// throw an IllegalArgumentException unless `0 <= v < V`
	private void validateVertex(int v) {
		int V = marked.length;
		if(v < 0 || v >= V)
			throw new IllegalArgumentException("vertex" + v + " is not between 0 and " + (V - 1));
	}

	// test
	public static void main(String[] args) {
		In in = new In(args[0]);
		Graph G = new Graph(in);
		int s = Integer.parseInt(args[1]);
		NonrecursiveDFS dfs = new NonrecursiveDFS(G, s);
		for(int v = 0; v < G.V(); v++)
			if(dfs.marked(v))
				StdOut.print(v + " ");
		StdOut.println();
	}
}
