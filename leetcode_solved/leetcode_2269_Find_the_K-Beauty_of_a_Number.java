// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Find the K-Beauty of a Number.
// Memory Usage: 40.6 MB, less than 100.00% of Java online submissions for Find the K-Beauty of a Number.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int divisorSubstrings(int num, int k) {
        int ret = 0;
        String numStr = String.valueOf(num);
        for (int i = 0; i <= numStr.length() - k; i++) {
            int x = Integer.parseInt(numStr.substring(i, i + k));
            if (x != 0 && num % x == 0) {
                ret++;
            }
        }
        return ret;
    }
}
