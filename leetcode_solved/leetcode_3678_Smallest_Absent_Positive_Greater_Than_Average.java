// Runtime 5 ms Beats 84.93% 
// Memory 45.07 MB Beats 77.77%
// .
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int smallestAbsent(int[] nums) {
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int len = nums.length, ret = Integer.MAX_VALUE;
        float avg = (int) (sum / len);
        Arrays.sort(nums);
        if (nums[0] == nums[len - 1]) {
            return Math.max(1, nums[0] + 1);
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > avg) {
                if (nums[i] - nums[i - 1] > 1) {
                    for (int j = nums[i - 1] + 1; j < nums[i]; j++) {
                        if (j > avg) {
                            ret = j;
                            break;
                        }
                    }
                }
            }
            if (ret != Integer.MAX_VALUE) {
                break;
            }
        }
        if (ret == Integer.MAX_VALUE) {
            if (nums[len - 1] <= 0) {
                return 1;
            } else {
                return nums[len - 1] + 1;
            }
        }

        if (ret <= 0) {
            if (nums[len - 1] <= 0) {
                return 1;
            }

            boolean flag = false;
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) {
                    if (nums[i - 1] <= 0) {
                        if (nums[i] > 1) {
                            return 1;
                        }
                    } else if (nums[i] - nums[i - 1] > 1) {
                        ret = nums[i - 1] + 1;
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                ret = nums[len - 1] + 1;
            }
        }

        return ret;
    }
}
