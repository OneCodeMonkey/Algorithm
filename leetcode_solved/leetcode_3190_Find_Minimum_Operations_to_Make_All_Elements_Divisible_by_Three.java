// Runtime 0 ms Beats 100.00%
// Memory 42.12 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumOperations(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret += num % 3 == 0 ? 0 : 1;
        }

        return ret;
    }
}
