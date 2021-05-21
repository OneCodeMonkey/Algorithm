// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
// Memory Usage: 35.2 MB, less than 97.08% of Java online submissions for Fibonacci Number.
// 递归
// T:O(n), S:O(1)
// 
class Solution {
    public int fib(int n) {
        int base1 = 0, base2 = 1;
        if (n == 0) {
            return base1;
        }
        if (n == 1) {
            return base2;
        }
        for (int i = 2; i <= n; i++) {
            int temp = base2;
            base2 = base2 + base1;
            base1 = temp;
        }

        return base2;
    }
}