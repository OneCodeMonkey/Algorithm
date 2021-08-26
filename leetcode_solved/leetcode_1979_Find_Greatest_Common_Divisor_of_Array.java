// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Greatest Common Divisor of Array.
// Memory Usage: 38.6 MB, less than 28.57% of Java online submissions for Find Greatest Common Divisor of Array.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int findGCD(int[] nums) {
        int maxE = Integer.MIN_VALUE, minE = Integer.MAX_VALUE;
        for (int i: nums) {
            maxE = Math.max(maxE, i);
            minE = Math.min(minE, i);
        }

        return gcd(maxE, minE);
    }

    private int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return b;
    }
}