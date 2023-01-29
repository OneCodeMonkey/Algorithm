// AC: Runtime 1 ms Beats 99.91% 
// Memory 59.6 MB Beats 79.97%
// Two-pointer.
// T:O(m + n), S:O(1)
// 
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ret = -1;
        int pos1 = 0, pos2 = 0, len1 = nums1.length, len2 = nums2.length;
        while (pos1 < len1 && pos2 < len2) {
            if (nums1[pos1] == nums2[pos2]) {
                return nums1[pos1];
            }
            if (nums1[pos1] > nums2[pos2]) {
                while (pos2 < len2 && nums1[pos1] > nums2[pos2]) {
                    pos2++;
                }
            } else {
                while (pos1 < len1 && nums1[pos1] < nums2[pos2]) {
                    pos1++;
                }
            }
        }

        return ret;
    }
}
