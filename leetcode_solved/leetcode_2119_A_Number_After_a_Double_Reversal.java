// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for A Number After a Double Reversal.
// Memory Usage: 35.8 MB, less than 33.33% of Java online submissions for A Number After a Double Reversal.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || (num % 10 != 0);
    }
}