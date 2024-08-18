// Runtime 55 ms Beats 100.00%
// Memory 63.09 MB Beats 50.00%
// Hashmap & check diff in adjacent elements.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int len = nums.length;
        int[] ret = new int[len + 1 - k];

        long curSum = 0;
        boolean flag = true;
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int i = 0; i < k; i++) {
            numCount.merge(nums[i], 1, Integer::sum);
            curSum += nums[i];
            if (i != 0 && nums[i] - nums[i - 1] != 1) {
                flag = false;
            }
        }

        for (int i = 0; i <= len - k; i++) {
            long targetSum = ((long) (nums[i] + nums[i] + k - 1) * k / 2);
//            System.out.println("size: " + numCount.size() + " -- curSum: " + curSum + " -- trueSum: " + targetSum);
            if (!flag || numCount.size() != k || curSum != targetSum) {
                ret[i] = -1;
            } else {
                ret[i] = nums[i + k - 1];
            }
            if (i != len - k) {
                if (numCount.get(nums[i]) > 1) {
                    numCount.merge(nums[i], -1, Integer::sum);
                } else {
                    numCount.remove(nums[i]);
                }
                numCount.merge(nums[i + k], 1, Integer::sum);
                curSum -= nums[i];
                curSum += nums[i + k];

                flag = nums[i + k] - nums[i + k - 1] == 1;
            }
        }

        return ret;
    }
}
