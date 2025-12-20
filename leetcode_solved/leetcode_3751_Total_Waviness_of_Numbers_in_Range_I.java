// Runtime 25 ms Beats 91.99% 
// Memory 46.37 MB Beats 84.95%
// Brute-force.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ret = 0;
        if (num2 > 100) {
            for (int i = num1; i <= num2; i++) {
                String raw = String.valueOf(i);
                for (int j = 1; j < raw.length() - 1; j++) {
                    char c1 = raw.charAt(j - 1), c2 = raw.charAt(j), c3 = raw.charAt(j + 1);
                    if (c2 > c1 && c2 > c3) {
                        ret++;
                    } else if (c2 < c1 && c2 < c3) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}
