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
	public static Graph wheel(int V) {
		if(V <= 1)
			throw new IllegalArgumentException("Number of vertices must be at least 2");
		Graph G = new Graph(V);
		int[] vertices = new int[V];
		for(int i = 0; i < V; i++)
			vertices[i] = i;
		StdRandom.shuffle(vertices);

		for(int i = 0; i < V - 1; i++)
			G.addEdge(vertices[i], vertices[i + 1]);
		
		G.addEdge(vertices[V - 1], vertices[1]);

		for(int i = 1; i < V; i++)
			G.addEdge(vertices[0], vertices[i]);

		return G;
	}

	// Returns a star graph on `V` vertices
	public static Graph star(int V) {
		if(V <= 0)
			throw new IllegalArgumentException("Number of vertices must be at least one");
		Graph G = new Graph(V);
		int[] vertices = new int(V);
		for(int i = 0; i < V; i++)
			vertices[i] = i;
		StdRandom.shuffle(vertices);

		for(int i = 1; i < V; i++)
			G.addEdge(vertices[0], vertices[i]);

		return G;
	}

	// Returns a uniformly random `k-regular` graph on `V` vertices(not necessarily
	// simple). The graph is simple with probability only about e^(-k^2/4);, which is
	// tiny when k = 14.
	public static Graph regular(int V, int k) {
		if(V * k % 2 != 0)
			throw new IllegalArgumentException("Number of vertices * k must be even");
		Graph G = new Graph(V);
		int[] vertices = new int[V * k];
		for(int v = 0; v < V; v++)
			for(int j = 0; j < k; j++)
				vertices[v + V * j] = v;

		// pick a random perfect matching
		StdRandom.shuffle(vertices);
		for(int i = 0; i < V * k / 2; i++)
			G.addEdge(vertices[2 * i], vertices[2 * i + 1]);

		return G;
	}

	// Returns a uniformly random tree on `V` vertices.
	public static Graph tree(int V) {
		Graph G = new Graph(V);
		// special case
		if(V == 1)
			return G;
		// Cayley's theorem: there are V^(V - 2) labeled trees on V vertices
		// Prufer sequence: sequence of V - 2 values between 0 and V - 1
		// Prufer's proof of Cayley's theorem: Prufer sequences are in 1-1
		// with labeled trees on V vertices.
		int [] prufer = new int[V - 2];
		for(int i = 0; i < V - 2; i++)
			prufer[i] = StdRandom.uniform(V);

		// degree of vertex v = 1 + number of times it appears in Prufer sequence
		int[] degree = new int[V];
		for(int v = 0; v < V; v++)
			degree[v] = 1;
		for(int i = 0; i < V - 2; i++)
			degree[prufer[i]]++;

		// pq contains all vertices of degree 1
		MinPQ<Integer> pq = new MinPQ<Integer>();
		for(int v = 0; v < V; v++) {
			if(degree[v] == 1)
				pq.insert(v);
		}

		// repeatedly delMin() degree 1 vertex that has the minimum index
		for(int i = 0; i< V - 2; i++) {
			int v = pq.delMin();
			G.addEdge(v, prufer[i]);
			degree[v]--;
			degree[prufer[i]]--;
			if(degree[prufer[i]] == 1)
				pq.insert(prufer[i]);
		}
		G.addEdge(pq.delMin(), pq.delMin());

		return G;
	}

	// test
	public static void main(String[] args) {
		int V = Integer.parseInt(args[0]);
		int E = Integer.parseInt(args[1]);
		int V1 = V / 2;
		int V2 = V - V1;

		StdOut.println("complete graph");
		StdOut.println(complete(V));
		StdOut.println();

		StdOut.println("simple");
		StdOut.println(simple(V, E));
		StdOut.println();

		StdOut.println("Erdos-Renyi");
		double p = (double)E / (V * (V - 1) / 2.0);
		StdOut.println(simple(V, p));
		StdOut.println();

		StdOut.println("complete bipartite");
		StdOut.println(completeBipartite(V1, V2));
		StdOut.println();

		StdOut.println("bipartite");
		StdOut.println(bipartite(V1, V2, E));
		StdOut.println();

		StdOut.println("Erods Renyi bipartite");
		double q = (double)E / (V1 * V2);
		StdOut.println(bipartite(V1, V2, q));
		StdOut.println();

		StdOut.println("path");
		StdOut.println(path(V));
		StdOut.println();

		StdOut.println("cycle");
		StdOut.println(cycle(V));
		StdOut.println();

		StdOut.println("binary tree");
		StdOut.println(binaryTree(V));
		StdOut.println();

		StdOut.println("tree");
		StdOut.println(tree(V));
		StdOut.println();

		StdOut.println("4-regular");
		StdOut.println(regular(V, 4));
		StdOut.println();

		StdOut.println("star");
		StdOut.println(star(V));
		StdOut.println();

		StdOut.println("wheel");
		StdOut.println(wheel(V));
		StdOut.println();
	}
}
