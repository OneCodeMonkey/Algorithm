// AC: Runtime 10 ms Beats 96.80% 
// Memory 82.2 MB Beats 56.72%
// Graph: Using a array to restore indegree of every vertex.
// T:O(edges.length), S:O(n)
// 
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegrees = new int[n];
        for (List<Integer> edge : edges) {
            inDegrees[edge.get(1)]++;
        }
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegrees[i] == 0) {
                ret.add(i);
            }
        }

        return ret;
    }
}
