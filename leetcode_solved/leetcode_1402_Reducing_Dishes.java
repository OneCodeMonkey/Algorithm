// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Reducing Dishes.
// Memory Usage: 37 MB, less than 49.41% of Java online submissions for Reducing Dishes.
// sort and judge the sum of satisfaction from (size - 1) to curPos is positive.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int size = satisfaction.length, ret = 0, tempSum = 0;
        for (int i = size - 1; i >= 0; i--) {
            // tempSum is sum of satisfaction[size - 1 : i]
            tempSum += satisfaction[i];

            if (tempSum > 0) {
                ret += tempSum;
            } else {
                break;
            }
        }
        
        return ret;
    }
}