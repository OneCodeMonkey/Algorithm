// AC: Runtime: 1 ms, faster than 93.09% of Java online submissions for Maximum Product Subarray.
// Memory Usage: 38.9 MB, less than 58.56% of Java online submissions for Maximum Product Subarray.
// using two arrays to record current max prefix product and min prefix product.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxProduct(int[] nums) {
        int size = nums.length, ret = nums[0], iMax = ret, iMin = ret;
        for (int i = 1; i < size; i++) {
            if (nums[i] < 0) {
                int temp = iMax;
                iMax = iMin;
                iMin = temp;
            }

            iMax = Math.max(nums[i], iMax * nums[i]);
            iMin = Math.min(nums[i], iMin * nums[i]);

            ret = Math.max(ret, iMax);
        }

        return ret;
    }
}