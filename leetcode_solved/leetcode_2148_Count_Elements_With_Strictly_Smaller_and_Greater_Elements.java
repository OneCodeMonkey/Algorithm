// AC: Runtime: 1 ms, faster than 50.00% of Java online submissions for Count Elements With Strictly Smaller and Greater Elements .
// Memory Usage: 39.2 MB, less than 12.50% of Java online submissions for Count Elements With Strictly Smaller and Greater Elements .
// count min and max.
// T:O(n), S:O(1)
// 
class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minCount = 0, maxCount = 0;
        for (int i: nums) {
            if (i < min) {
                min = i;
                minCount = 1;
            } else if (i == min) {
                minCount++;
            }

            if (i > max) {
                max = i;
                maxCount = 1;
            } else if (i == max) {
                maxCount++;
            }
        }

        return min == max ? 0 : (nums.length - minCount - maxCount);
    }
}