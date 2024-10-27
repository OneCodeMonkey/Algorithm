// Runtime 1 ms Beats 100.00%
// Memory 44.85 MB Beats 59.36%
// Bitmap: 找到从右边起，第一个 0 bit 位，然后原数字 A 减去这个 0 位对应的 1XXX 二进制对应值的一半 1XX. 减去这个 1XX 得到的 ans 可满足 ans|(ans+1) = A.
// T:O(n * logk), S:O(1)
// 
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size(), pos = 0;
        int[] ret = new int[len];
        for (int num : nums) {
            if (num % 2 == 0) {
                ret[pos++] = -1;
            } else {
                ret[pos++] = num - ((num + 1) & (-num - 1)) / 2;
            }
        }

        return ret;
    }
}
