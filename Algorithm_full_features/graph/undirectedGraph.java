/**
 * A graph implemented with array of sets.
 * Parallel edges and self-loops are allowed.
 *
 */
import java.util.NoSuchElementException;

/**
 * The `Graph` class represents an undirected graph of vertices named 0 through `V` - 1.
 * It supports the following two primary operations: add an edge to the graph,
 * iterate over all of the vertices adjacent to a vertex. It also provides methods
 * for returning the number of vertices `V` and the number of edges `E`. Parallel
 * edges and self-loops are allowed.
 * By convention, a self-loop `v-v` appears in the adjacency list of `v` twice and contributes
 * two to the degree of `v`.
 *
 * This implementation uses an adjacency-lists representation, which is a vertex-indexed
 * array of `Bag` objects.
 * All operations take constant time(in the worst case) except iterating over the
 * vertices adjacent to a given vertex, which takes time proportional to the number
 * of such vertices.
 *
 */
 public class Graph {
 	private static final String NEWLINE = System.getProperty("line.separator");
 	private final int V;
 	private int E;
 	private Bag<Integer>[] adj;

 	/* Initializes an empty graph with `V` vertices and 0 edges. */
 	public Graph(int V) {
 		if(V < 0)
 			throw new IllegalArgumentException("Number of vertices must be non-negative");
 		this.V = V;
 		this.E = 0;
 		adj = (Bag<Integer>[]) new Bag[V];
 		for(int v = 0; v < V; v++)
 			adj[v] = new Bag<Integer>();
 	}

 	/* Initializes a graph from the specified input stream.
 	 * The format is the number of vertices `V`, followed by the number of edges `E`,
 	 * followed by `E` pairs of vertices, with each entry separated by whitespace.
 	 * 
 	 */
 	public Graph(In in) {
 		try{
 			this.V = in.readInt();
 			if(V < 0)
 				throw new IllegalArgumentException("number of vertices in a Graph must be non-negative");
 			adj = (Bag<Integer>[]) new Bag[V];
 			for(int v = 0; v < V; v++)
 				adj[v] = new Bag<Integer>();
 			int E = in.readInt();
 			if(E < 0)
 				throw new IllegalArgumentException("number of edges in a Graph must be non-negative");
 			for(int i = 0; i < E; i++) {
 				int v = in.readInt();
 				int w = in.readInt();
 				validateVertex(v);
 				validateVertex(w);
 				addEdge(v, w);
 			}
 		} catch(NoSuchElementException e) {
 			throw new IllegalArgumentException("invalid input format in Graph constructor", e);
 		}
 	}

 	/* initializes a new Graph that is a deep copy of `G` */
 	public Graph(Graph G) {
 		this(G.V());
 		this.E = G.E();
 		for(int v = 0; v < G.V(); v++) {
 			// reverse so that adjacency list is in same order as original
 			Stack<Integer> reverse = new Stack<Integer>();
 			for(int w:G.adj[v])
 				reverse.push(w);
 			for(int w:reverse)
 				adj[v].add(w);
 		}
 	}
 	
 	/* return the number of vertices in this graph. */
 	public int V() {
 		return v;
 	}

 	/* returns the number of edges in this graph. */
 	public int E() {
 		return E;
 	}

 	// throws an IllegalArgumentException unless (0 <= v < V)
 	private void validateVertex(int v) {
 		if(v < 0 || v >= V)
 			throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
 	}

 	/* adds the undirected edge v-w to this graph. */
 	public void addEdge(int v, int w) {
 		validateVertex(v);
 		validateVertex(w);
 		E++;
 		adj[v].add(w);
 		adj[w].add(v);
 	}

 	/* returns the vertices adjacent to vertext `v` */
 	public Iterable<Integer> adj(int v) {
 		validateVertex(v);
 		return adj[v];
 	}

 	/* returns the degree of vertext `v` */
 	public int degree(int v) {
 		validateVertex(v);
 		return adj[v].size();
 	}

 	/* returns a string representation of this graph */
 	public String toString() {
 		StringBuilder s = new StringBuffer();
 		s.append(V + " vertices, " + E + " edges " + NEWLINE);
 		for(int v = 0; v < V; v++) {
 			s.append(v + ": ");
 			for(int w:adj[v])
 				s.append(w + " ");
 			s.append(NEWLINE);
 		}
 		return s.toString();
 	}

 	/* test */
 	public static void main(String[] args) {
 		In in = new In(args[0]);
 		Graph G = new Graph(in);
 		StdOut.println(G);
 	}
 }
 