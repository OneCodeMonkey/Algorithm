/**
 * Runtime: 20 ms, faster than 34.84% of C++ online submissions for Single Number.
 * Memory Usage: 9.6 MB, less than 100.00% of C++ online submissions for Single Number. *
 * 
 * 思路：用异或运算 ^= , 0 ^ A = A, A ^ A = 0, 有配对就会抵消一次运算造成的影响。
 * 传统的思路，既不能排序，也不能用至少 O(n) 的额外空间，是办不到的。
 */
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ret = 0;
        for(int i = 0; i < nums.size(); i++) {
        	ret ^= nums[i];
        }
        return ret;
    }
};