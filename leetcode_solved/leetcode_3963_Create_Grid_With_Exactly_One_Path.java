// Runtime 3 ms Beats 50.06% 
// Memory 46.10 MB Beats 99.98%
// constructive.
// T:O(m*n), S:O(m*n)
// 
class Solution {
    public String[] createGrid(int m, int n) {
        String[] ret = new String[m];
        if (m == 1) {
            ret[0] = ".".repeat(n);
        } else {
            for (int i = 0; i < m - 1; i++) {
                ret[i] = "." + "#".repeat(n - 1);
            }
            ret[m - 1] = ".".repeat(n);
        }

        return ret;
    }
}
