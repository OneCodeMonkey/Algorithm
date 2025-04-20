// Runtime 1 ms Beats 100.00% 
// Memory 44.98 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum % k;
    }
}
