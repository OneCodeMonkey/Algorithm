// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Center of Star Graph.
// Memory Usage: 64.6 MB, less than 48.99% of Java online submissions for Find Center of Star Graph.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int findCenter(int[][] edges) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (edges[0][i] == edges[1][j]) {
                    return edges[0][i];
                }
            }
        }
        
        return -1;
    }
}