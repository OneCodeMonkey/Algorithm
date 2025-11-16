// Runtime 7 ms Beats 99.98% 
// Memory 46.10 MB Beats 79.92%
// Greedy.
// T:O(1), S:O(n)
// 
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ret = new StringBuilder();
        if (sum <= 9 * num) {
            int mod = sum / 9, left = sum % 9;
            if (mod > 0) {
                ret.append("9".repeat(mod));
                if (left == 0) {
                    ret.append("0".repeat(num - mod));
                } else {
                    ret.append(left).append("0".repeat(num - mod - 1));
                }
            } else {
                if (left == 0) {
                    ret.append("0".repeat(num));
                } else {
                    ret.append(left).append("0".repeat(num - 1));
                }
            }
        }

        return ret.toString();
    }
}
