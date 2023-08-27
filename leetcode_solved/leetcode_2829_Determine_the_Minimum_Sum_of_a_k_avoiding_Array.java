// AC: Runtime 1 ms Beats 100%
// Memory 39.9 MB Beats 100%
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumSum(int n, int k) {
        int ret = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (i + i - 1 >= k) {
                count = i - 1;
                break;
            }
            ret += i;
            if (i == n) {
                return ret;
            }
        }
        for (int i = count + 1; i <= n; i++) {
            ret += k++;
        }

        return ret;
    }
}
