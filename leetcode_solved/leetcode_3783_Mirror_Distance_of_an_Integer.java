// Runtime 1 ms Beats 99.90% 
// Memory 42.79 MB Beats 53.61%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int mirrorDistance(int n) {
        int ret = 0;
        if (n >= 10) {
            List<Integer> digit = new ArrayList<>();
            while (n > 0) {
                digit.add(n % 10);
                n /= 10;
            }
            for (int i = 0; i < digit.size() / 2; i++) {
                ret += (digit.get(i) - digit.get(digit.size() - 1 - i)) * (Math.pow(10, digit.size() - 1 - i) - Math.pow(10, i));
            }
        }

        return Math.abs(ret);
    }
}
