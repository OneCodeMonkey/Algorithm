// Runtime 2 ms Beats 100.00% 
// Memory 44.36 MB Beats 100.00%
// brute-force.
// T:O(n^2), S:O(n)
// 
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int len = fruits.length, ret = 0;
        int[] visited = new int[len];
        for (int i : fruits) {
            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (visited[j] == 1) {
                    continue;
                }
                if (baskets[j] >= i) {
                    visited[j] = 1;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                ret++;
            }
        }

        return len - ret;
    }
}
