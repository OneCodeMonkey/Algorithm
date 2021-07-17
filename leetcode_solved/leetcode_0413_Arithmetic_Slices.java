// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Arithmetic Slices.
// Memory Usage: 36.7 MB, less than 80.00% of Java online submissions for Arithmetic Slices.
// thoughts: find the consecutive subarray, then it could contribute (len - 1) * (len - 2) / 2 slices, 
//        then start from the end of last consecutive +1, and go ahead to find the next consecutive.
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int size = nums.length, ret = 0;
        if (size >= 3) {
            for (int i = 0; i < size - 2;) {
                int diff1 = nums[i + 1] - nums[i], diff2 = nums[i + 2] - nums[i + 1];
                if (diff1 == diff2) {
                    int end = i + 2;
                    while (end < size && nums[end] - nums[end - 1] == diff1) {
                        end++;
                    }
                    // length of the consecutive subarray that has same adjacent diff.
                    int len = end - i;
                    // may produce such amount amount of `arithmetic slices`.
                    ret += (len - 1) * (len - 2) / 2;
                    
                    // forwarding to the sequence's end + 1
                    i = end - 2;
                } else {
                    i++;
                }
            }
        }

        return ret;
    }
}