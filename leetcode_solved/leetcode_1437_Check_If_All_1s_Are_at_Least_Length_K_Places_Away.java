// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Check If All 1's Are at Least Length K Places Away.
// Memory Usage: 48.9 MB, less than 69.01% of Java online submissions for Check If All 1's Are at Least Length K Places Away.
// .
// T:O(n), S:O(1)
//
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int tempDistance = -1, size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                if (tempDistance != -1 && tempDistance < k) {
                    return false;
                }
                tempDistance = 0;
            } else {
                if (tempDistance != -1) {
                    tempDistance++;
                }
            }
        }

        return true;
    }
}