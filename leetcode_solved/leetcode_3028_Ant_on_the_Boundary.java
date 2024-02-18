// Runtime 0 ms Beats 100.00% of users with Java
// Memory 41.68 MB Beats 95.33% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int cur = 0, ret = 0;
        for (int num : nums) {
            cur += num;
            if (cur == 0) {
                ret++;
            }
        }

        return ret;
    }
}
