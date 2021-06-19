// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
// Memory Usage: 35.6 MB, less than 75.72% of Java online submissions for Count Odd Numbers in an Interval Range.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int countOdds(int low, int high) {
        return (low % 2 == 0 && high % 2 == 0) ? (high - low) / 2 : (high - low) / 2 + 1;
    }
}