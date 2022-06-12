// AC: Runtime: 46 ms, faster than 61.22% of Java online submissions for Partition Array Such That Maximum Difference Is K.
// Memory Usage: 82.3 MB, less than 15.65% of Java online submissions for Partition Array Such That Maximum Difference Is K.
// sort & greedy
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ret = 0, len = nums.length, sequenceStart = -1, lastNum;
        for (int i = 0; i < len; i++) {
            if (sequenceStart == -1) {
                sequenceStart = nums[i];
                if (i == len - 1) {
                    ret++;
                }
            } else {
                if (nums[i] - sequenceStart > k) {
                    ret++;
                    sequenceStart = nums[i];
                    if (i == len - 1) {
                        ret++;
                    }
                } else if (i == len - 1) {
                    ret++;
                }
            }
        }

        return ret;
    }
}