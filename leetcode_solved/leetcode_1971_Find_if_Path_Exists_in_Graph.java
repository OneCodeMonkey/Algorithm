// Solution1: dfs travel
// AC: Runtime: 144 ms, faster than 51.15% of Java online submissions for Find if Path Exists in Graph.
// Memory Usage: 132.6 MB, less than 70.42% of Java online submissions for Find if Path Exists in Graph.
// using a stack to push nodes that will first try. this is a dfs-way
// T:O(n), S:O(n) ~ O(n^2)
//
class Solution {
    private int[] used;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        used = new int[n];
        HashMap<Integer, List<Integer>> record = new HashMap<>();
        for (int[] edge: edges) {
            int from = edge[0], to = edge[1];
            if (record.containsKey(from)) {
                record.get(from).add(to);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(to);
                record.put(from, tempList);
            }
            if (record.containsKey(to)) {
                record.get(to).add(from);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(from);
                record.put(to, tempList);
            }
        }
        Stack<Integer> search = new Stack<>();
        search.push(start);
        used[start] = 1;
        while (!search.empty()) {
            int top = search.pop();
            if (top == end) {
                return true;
            }
            for (int i: record.get(top)) {
                if (used[i] == 1) {
                    continue;
                }
                search.push(i);
                used[i] = 1;
            }
        }

        return false;
    }
}

// Solution2: bfs travel
// AC: Runtime: 106 ms, faster than 67.35% of Java online submissions for Find if Path Exists in Graph.
// Memory Usage: 145.2 MB, less than 60.32% of Java online submissions for Find if Path Exists in Graph.
// bfs-way. using queue as bfs search queue of node.
// T:O(n), S:O(n) ~ O(n^2)
//
class Solution {
    private int[] used;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        used = new int[n];
        HashMap<Integer, List<Integer>> record = new HashMap<>();
        for (int[] edge: edges) {
            int from = edge[0], to = edge[1];
            if (record.containsKey(from)) {
                record.get(from).add(to);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(to);
                record.put(from, tempList);
            }
            if (record.containsKey(to)) {
                record.get(to).add(from);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(from);
                record.put(to, tempList);
            }
        }
        Queue<Integer> search = new ArrayDeque<>();
        search.offer(start);
        used[start] = 1;
        while (!search.isEmpty()) {
            int top = search.poll();
            if (top == end) {
                return true;
            }
            for (int i: record.get(top)) {
                if (used[i] == 1) {
                    continue;
                }
                search.offer(i);
                used[i] = 1;
            }
        }

        return false;
    }
}

// Solution3: disjoint set
// AC: Runtime: 15 ms, faster than 88.05% of Java online submissions for Find if Path Exists in Graph.
// Memory Usage: 94.1 MB, less than 94.24% of Java online submissions for Find if Path Exists in Graph.
// construct a disjoint set to check whether two node can reach same destination, if so, then the two node is connected.
// T:O(n), S:O(n)
//
class Solution {
    private int[] parent;

    private int findParent(int u) {
        return parent[u] == u ? u : (parent[u] = findParent(parent[u]));
    }

    private void makeSet(int u, int v) {
        int pu = findParent(u), pv = findParent(v);
        parent[pu] = pv;
    }

    public boolean validPath(int n, int[][] edges, int start, int end) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge: edges) {
            makeSet(edge[0], edge[1]);
            makeSet(edge[1], edge[0]);
        }

        return findParent(start) == findParent(end);
    }
}