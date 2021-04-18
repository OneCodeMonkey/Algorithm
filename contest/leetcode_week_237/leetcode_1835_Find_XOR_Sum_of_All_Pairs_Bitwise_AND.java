// AC:
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Find XOR Sum of All Pairs Bitwise AND.
// Memory Usage: 52.3 MB, less than 25.00% of Java online submissions for Find XOR Sum of All Pairs Bitwise AND.
// 
// 思路：这个运算场景满足结合律： (a1 ^ a2) & (b1 ^ b2) = (a1 & b1) ^ (a1 & b2) ^ (a2 & b1) ^ (a2 & b2)
// 复杂度：T：O(m + n), S:O(1)
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int ret1 = 0, ret2 = 0;
        for(int i: arr1) {
            ret1 ^= i;
        }
        for(int i: arr2) {
            ret2 ^= i;
        }
        return ret1 & ret2;
    }
}