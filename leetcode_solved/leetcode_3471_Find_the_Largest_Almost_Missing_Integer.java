// Runtime 2 ms Beats 91.50% 
// Memory 42.62 MB Beats 99.16%
// 注意当 nums.length == k 时，即使有元素重复出现，那么也满足 它只出现在一个子数组 的要求，此时只需要取数组中最大元素即可。
// T:O(n), S:O(n)
// 
class Solution {
    public int largestInteger(int[] nums, int k) {
        int len = nums.length, ret = -1;
        if (len == 1) {
            return nums[0];
        }
        if (k == 1) {
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int i : nums) {
                record.merge(i, 1, Integer::sum);
            }
            for (int key : record.keySet()) {
                if (record.get(key) == 1) {
                    ret = Math.max(ret, key);
                }
            }
        } else if (len == k) {
            for (int i : nums) {
                ret = Math.max(ret, i);
            }
        } else {
            if (nums[0] != nums[len - 1]) {
                boolean flag1 = true, flag2 = true;
                for (int i = 1; i < len - 1; i++) {
                    if (flag1 && nums[i] == nums[0]) {
                        flag1 = false;
                    }
                    if (flag2 && nums[i] == nums[len - 1]) {
                        flag2 = false;
                    }
                    if (!flag1 && !flag2) {
                        break;
                    }
                }
                if (flag1 && flag2) {
                    ret = Math.max(nums[0], nums[len - 1]);
                } else if (flag1) {
                    ret = nums[0];
                } else if (flag2) {
                    ret = nums[len - 1];
                }
            }
        }

        return ret;
    }
}
