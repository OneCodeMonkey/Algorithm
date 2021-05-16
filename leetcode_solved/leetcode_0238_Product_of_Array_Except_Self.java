// AC： Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
// Memory Usage: 48.9 MB, less than 92.03% of Java online submissions for Product of Array Except Self.
// 注意题目中提到的，所有元素乘积不超过 int 范围，用这点就可以构造一个 int数组来存每一个元素之前元素的乘积。
// T:O(n), S:O(n)
// 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] productOfPrevious = new int[size];
        productOfPrevious[0] = 1;
        for (int i = 1; i < size; i++) {
            productOfPrevious[i] = productOfPrevious[i - 1] * nums[i - 1];
        }
        int productOfRight = 1;
        for (int i = size - 1; i >= 0; i--) {
            int now = nums[i];
            nums[i] = productOfPrevious[i] * productOfRight;
            productOfRight *= now;
        }
        
        return nums;
    }
}