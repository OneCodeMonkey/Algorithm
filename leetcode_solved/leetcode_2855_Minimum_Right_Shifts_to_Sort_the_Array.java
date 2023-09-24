// AC: Runtime 1ms Beats 100.00%of users with Java 
// Memory 41.39MB Beats 78.62%of users with Java
// Check if the sequence has one more decrease adjacent pair, and if just one, we need to check arr[0] >= arr[n-1].
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int ret = -1, len = nums.size(), minIndex = 0;
        boolean hasDecrease = false;

        for (int i = 0; i < len - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                if (hasDecrease) {
                    return ret;
                }
                hasDecrease = true;
                minIndex = i + 1;
            }
        }
        if (hasDecrease && nums.get(0) < nums.get(len - 1)) {
            return ret;
        }

        return !hasDecrease ? 0 : (len - minIndex);
    }
}
