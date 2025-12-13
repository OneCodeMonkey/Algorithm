// Runtime 2 ms Beats 50.00% 
// Memory 42.74 MB Beats 50.00%
// .
// T:O(logn), S:O(logn)
// 
class Solution {
    public int minimumFlips(int n) {
        StringBuilder bitStr = new StringBuilder();
        while (n > 0) {
            bitStr.append(n % 2);
            n /= 2;
        }
        String bitS1 = bitStr.toString();
        int ret = 0;
        for (int i = 0; i < bitStr.length() / 2; i++) {
            if (bitS1.charAt(i) != bitS1.charAt(bitS1.length() - 1 - i)) {
                ret += 2;
            }
        }

        return ret;
    }
}
