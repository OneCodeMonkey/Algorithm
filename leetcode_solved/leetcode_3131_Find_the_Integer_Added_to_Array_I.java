// Runtime 0 ms Beats 100.00% of users with Java
// Memory 42.76 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max1 = -1, max2 = -1;
        for (int num : nums1) {
            max1 = Math.max(max1, num);
        }
        for (int num : nums2) {
            max2 = Math.max(max2, num);
        }

        return max2 - max1;
    }
}
