/**
 * AC:
 * Runtime: 16 ms, faster than 20.60% of C++ online submissions for Single Number II.
 * Memory Usage: 9.6 MB, less than 87.50% of C++ online submissions for Single Number II.
 *
 * 思路：归结为数组的单元素查找问题。
 * 
 */
class Solution {
public:
    int singleNumber(vector<int>& nums) {
    	int x1 = 0, x2 = 0, mask = 0;
    	for(int i : nums) {
    		x2 ^= x1 & i;
    		x1 ^= i;
    		mask = ~(x1 & x2);
    		x2 &= mask;
    		x1 &= mask;
    	}
        return x1;
    }
};