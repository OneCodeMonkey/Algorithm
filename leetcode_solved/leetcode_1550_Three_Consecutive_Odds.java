// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Three Consecutive Odds.
// Memory Usage: 40.1 MB, less than 5.05% of Java online submissions for Three Consecutive Odds.
// .
// T:O(n), S:O(1)
//
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCount = 0;
        for (int i: arr) {
            if (i % 2 == 1) {
                oddCount++;
                if (oddCount == 3) {
                    return true;
                }
            } else {
                oddCount = 0;
            }
        }
        
        return false;
    }
}