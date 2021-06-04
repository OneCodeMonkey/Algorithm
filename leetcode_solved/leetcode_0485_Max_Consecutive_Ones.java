// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones.
// Memory Usage: 40.4 MB, less than 56.96% of Java online submissions for Max Consecutive Ones.
// 略
// T:O(n), S:O(1)
// 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, temp = 0;
        for (int i: nums) {
            if (i == 1) {
                temp++;
                if (temp > max) {
                    max = temp;
                }
            } else {
                temp = 0;
            }
        }
        return max;
    }
}