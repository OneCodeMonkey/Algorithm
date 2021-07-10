// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Operations to Make Array Equal.
// Memory Usage: 35.4 MB, less than 94.08% of Java online submissions for Minimum Operations to Make Array Equal.
// find the regularity
// T:O(1), S:O(1)
//
class Solution {
    public int minOperations(int n) {
        return n % 2 == 0 ? (n * n / 4) : ((n - 1) * (n + 1) / 4);
    }
}