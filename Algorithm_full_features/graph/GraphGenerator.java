/**
 * A graph generator.
 *
 * The `GraphGenerator` class provides static methods for creating various graphs,
 * including Erdos-Renyi random graphs, random bipartite graphs, from k-regular graphs,
 * and random rooted trees.
 *
 */
public class GraphGenerator {
	private static final class Edge implements Comparable<Edge> {
		private int v,;
		private int w;
		private Edge(int v, int w) {
			if(v < w) {
				this.v = v;
				this.w = w;
			} else {
				this.v = w;
				this.w = v;
			}
		}

		public int compareTo(Edge that) {
			if(this.v < that.v)
				return -1;
			if(this.v > that.v)
				return 1;
			if(this.w < that.w)
				return -1;
			if(this.w > that.w)
				return 1;
			return 0;
		}
	}

	// this class can't be instantiated
	private GraphGenerator() {}

	// returns a random simple graph containing `V` vertices and `E` edges.
	public static Graph simple(int V, int E) {
		if(E > (long)V*(V - 1) / 2)
			throw new IllegalArgumentException("Too many edges");
		if(E < 0)
			throw new IllegalArgumentException("edges can't be negative");
		Graph G = new Graph(V);
		SET<Edge> set = new SET<Edge>();
		while(G.E() < E) {
			int v = StdRandom.uniform(V);
			int w = StdRandom.uniform(V);
			Edge e = new Edge(v, w);
			if((v != w) && !set.contains(e)) {
				set.add(e);
				G.addEdge(v, w);
			}
		}
		return G;
	}

	// Returns a random simple graph on `V` vertices, with an edge between any two
	// vertices with probability `p`. This is sometimes referred to as the Erdos-Renyi
	// random graph model.
	public static Graph simple(int V, double p) {
		if(p < 0.0 || p > 1.0)
			throw new IllegalArgumentException("probability must be [0, 1]");
		Graph G = new Graph(V);
		for(int v = 0; v < V; v++) {
			for(int w = v + 1; w < V; w++)
				if(StdRandom.bernoulli(p))
					G.addEdge(v, w);
		}

		return G;
	}

	// Returns the complete graph on `V` vertices.
	public static Graph complete(int V) {
		return simple(V, 1.0);
	}

	// Returns a complete bipartite graph on `V1` and `V2` vertices.
	public static Graph completeBipartite(int V1, int V2) {
		return bipartite(V1, V2, V1*V2);
	}

	// Returns a random simple bipartite graph on `V1` and `V2` vertices with `E` edges.
	public static Graph bipartite(int V1, int V2, int E) {
		if(E > (long)V1 * V2)
			throw new IllegalArgumentException("Too many edges");
		if(E < 0)
			throw new IllegalArgumentException("Edges can't be negative");
		Graph G = new Graph(V1 + V2);
		int[] vertices = new int[V1 + V2];
		for(int i = 0; i < V1 + V2; i++)
			vertices[i] = i;

		StdRandom.shuffle(vertices);

		SET<Edge> set = new SET<Edge>();

		while(G.E() < E) {
			int i = StdRandom.uniform(V1);
			int j = V1 + StdRandom.uniform(V2);
			Edge e = new Edge(vertices[i], vertices[j]);
			if(!set.contains(e)) {
				set.add(e);
				G.addEdge(vertices[i], vertices[j]);
			}
		}

		return G;
	}

	// Returns a random simple bipartite graph on `V1` and `V2` vertices.
	// containing each possible edge with probability `p`
	public static Graph bipartite(int V1, int V2, double p) {
		if(p < 0.0 || p > 1.0)
			throw new IllegalArgumentException("probability must between 0 and 1");
		int[] vertices = new int[V1 + V2];
		for(int i = 0; i < V1 + V2; i++)
			vertices[i] = i;
		StdRandom.shuffle(vertices);
		Graph G = new Graph(V1 + V2);
		for(int i = 0; i < V1; i++)
			for(int j = 0; j < V2; j++)
				if(StdRandom.bernoulli(p))
					G.addEdge(vertices[i], vertices[V1 + j]);

		return G;
	}

	// Returns a path graph on `V` vertices.
	public static Graph path(int V) {
		Graph G = new Graph(V);
		int[] vertices = new int[V];
		for(int i = 0; i < V; i++)
			vertices[i] = i;
		StdRandom.shuffle(vertices);
		for(int i = 0; i < V - 1; i++)
			G.addEdge(vertices[i], vertices[i + 1]);

		return G;
	}

	// Returns a complete binary tree graph on `V` vertices
	public static Graph binaryTree(int V) {
		Graph G = new Graph(V);
		int[] vertices = new int[V];
		for(int i = 0; i < V; i++)
			vertices[i] = i;
		StdRandom.shuffle(vertices);
		for(int i = 1; i < V; i++)
			G.addEdge(vertices[i], vertices[(i - 1) / 2]);

		return G;
	}

	// Returns a cycle graph on `V` vertices.
	public static Graph cycle(int V) {
		Graph G = new Graph(V);
		int[] vertices = new int[V];
		for(int i = 0; i < V; i++) {
			vertices[i] = i;
		}

		StdRandom.shuffle(vertices);
		for(int i = 0; i < V - 1; i++)
			G.addEdge(vertices[i], vertices[i + 1]);
		G.addEdge(vertices[V - 1], vertices[0]);

		return G;
	}

	// Returns an Eulerian cycle graph on `V` vertices
	public static Graph eulerianCycle(int V, int E) {
		if(E <= 0)
			throw new IllegalArgumentException("An Eulerian cycle must have at least one edge");
		if(V <= 0)
			throw new IllegalArgumentException("An Eulerian cycle must have at least one vertex");
		Graph G = new Graph(V);
		int[] vertices = new int[E];
		for(int i = 0; i < E; i++)
			vertices[i] = StdRandom.uniform(V);
		for(int i = 0; i < E - 1; i++)
			G.addEdge(vertices[i], vertices[i + 1]);
		G.addEdge(vertices[E - 1], vertices[0]);

		return G;
	}

	// Returns an Eulerian path graph on `V` vertices.
	public static Graph eulerianPath(int V, int E) {
		if(E < 0)
			throw new IllegalArgumentException("negative number of edges");
		if(V <= 0)
			throw new IllegalArgumentException("An Eulerian path must have at least one vertex");
		Graph G = new Graph(V);
		int[] vertices = new int[E + 1];
		for(int i = 0; i < E + 1; i++)
			vertices[i] = StdRandom.uniform(V);
		for(int i = 0; i < E; i++)
			G.addEdge(vertices[i], vertices[i + 1]);

		return G;
	}

	// Returns a wheel on `V` vertices
}