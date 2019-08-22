/**
 * Run depth first search
 *
 */
public class DepthFirstSearch {
	private boolean[] marked;		// marked[v] = is there an s-v path?
	private int count;				// number of vertices connected to s

	// Computes the vertices in graph `G` that are connected to the source vertex `s`
	public DepthFirstSearch(Graph G, int s) {
		marked = new boolean[G.V()];
		validateVertex(s);
		dfs(G, s);
	}

	// depth first search from v
	private void dfs(Graph G, int v) {
		count++;
		marked[v] = true;
		for(int w:G.adj(v)) {
			if(!marked[w])
				dfs(G, w);
		}
	}

	// Is there a path between the source vertex `s` and vertex `v`?
	public boolean marked(int v) {
		validateVertex(v);
		return marked[v];
	}

	// Returns the number of vertices connected to the source vertex `s`
	public int count() {
		return count;
	}

	// throw an IllegalArgumentException unless `0 <= v < V`
	private void validateVertex(int v) {
		int V = marked.length;
		if(v < 0 || v >= V)
			throw new IllegalArgumentException("vertex " + V + "is not between 0 and " + (V - 1));
	}

	// test
	public static void main(String[] args) {
		In in = new In(args[0]);
		Graph G = new Graph(in);
		int s = Integer.parseInt(args[1]);
		DepthFirstSearch search = new DepthFirstSearch(G, s);
		for(int v = 0; v < G.V(); v++) {
			if(search.marked(v))
				StdOut.print(v + " ");
		}

		StdOut.println();
		if(search.count() != G.V())
			StdOut.println("NOT connected");
		else
			StdOut.println("connected");
	}
}
