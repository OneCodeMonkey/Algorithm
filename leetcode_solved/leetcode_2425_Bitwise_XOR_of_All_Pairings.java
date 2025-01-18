// Runtime 1 ms Beats 100.00%
// Memory 61.33 MB Beats 58.62%
// Trick: 因为 XOR 具有交换率，即 a^b = b^a, 假设有 arr1，arr2，如果 arr2 长度为偶数，那么 arr1 的所有元素，在最终 xor 全部叠加在一起之后，
// 其 xor 结果就是 0，那么只需考虑 arr2 所有元素 xor 的结果，次数若 arr1 长度也为偶数，那么结果直接就是0.
// T:O(m + n), S:O(1)
// 
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ret = 0;
        if (nums1.length % 2 == 1) {
            for (int i : nums2) {
                ret ^= i;
            }
        }
        if (nums2.length % 2 == 1) {
            for (int i : nums1) {
                ret ^= i;
            }
        }

        return ret;
    }
}
