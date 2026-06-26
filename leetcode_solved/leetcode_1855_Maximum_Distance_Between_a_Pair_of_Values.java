// Runtime 3 ms Beats 98.64% 
// Memory 90.17 MB Beats 39.32%
// Double pointer.
// T:O(max(m, n)), S:O(1)
// 
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, leftPos = len1 - 1, rightPos = len2 - 1, ret = 0;
        while (leftPos >= 0) {
            while (leftPos >= 0 && nums1[leftPos] <= nums2[rightPos]) {
                ret = Math.max(ret, rightPos - leftPos);
                leftPos--;
            }
            rightPos--;
            if (rightPos < 0) {
                break;
            }
        }

        return ret;
    }
}
