/**
 * AC: T:O(m+n) S:O(m+n)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 38.8 MB, less than 89.83% of Java online submissions for Merge Sorted Array.
 *
 * 双指针法：可从头部开始，也可以从尾部开始
 *
 * 备选较差思路：合并后大数组排序，T:O((m+n)log(m+n)), S:O(log(m+n))
 */
/**
 description:
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.


Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
 *
 */
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0, retP = 0;
        int[] ret = new int[m + n];
        while (p1 != m && p2 != n) {
            if (nums1[p1] < nums2[p2]) {
                ret[retP] = nums1[p1];
                p1++;
            } else {
                ret[retP] = nums2[p2];
                p2++;
            }
            retP++;
        }
        if (p1 != m) {  // 数组1有尾部
            while(p1 != m) {
                ret[retP] = nums1[p1];
                retP++;
                p1++;
            }
        }
        if (p2 != n) {  // 数组2有尾部
            while(p2 != n) {
                ret[retP] = nums2[p2];
                retP++;
                p2++;
            }
        }

        System.arraycopy(ret, 0, nums1, 0, m + n);
    }
}