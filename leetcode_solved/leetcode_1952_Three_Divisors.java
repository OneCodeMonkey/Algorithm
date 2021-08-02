// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Three Divisors.
// Memory Usage: 35.7 MB, less than 87.50% of Java online submissions for Three Divisors.
// .
// T:O(sqrt(n)), S:O(1)
// 
class Solution {
    public boolean isThree(int n) {
        int sqrtRoot = (int)Math.sqrt(n);
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < sqrtRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return sqrtRoot * sqrtRoot == n;
    }
}