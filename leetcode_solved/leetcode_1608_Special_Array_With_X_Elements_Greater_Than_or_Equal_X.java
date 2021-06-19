// AC: Runtime: 1 ms, faster than 77.48% of Java online submissions for Special Array With X Elements Greater Than or Equal X.
// Memory Usage: 38.8 MB, less than 7.09% of Java online submissions for Special Array With X Elements Greater Than or Equal X.
// .
// T:O(nlogn), S:O(1)
//
class Solution {
    public int specialArray(int[] nums) {
        int count = 0, size = nums.length, pos = size - 1;
        Arrays.sort(nums);
        while (pos >= 0) {
            count++;
            while (pos >= 1 && nums[pos] == nums[pos - 1]) {
                count++;
                pos--;
            }
            if (count == nums[pos]) {
                return count;
            }
            if (count < nums[pos]) {
                if (pos == 0) {
                    return count;
                } else {
                    if (nums[pos] - nums[pos - 1] - 1 >= nums[pos] - count) {
                        return count;
                    }
                }
            }
            pos--;
        }
        return -1;
    }
}