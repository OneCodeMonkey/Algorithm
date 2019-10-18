/**
 * AC:
 * Runtime: 24 ms, faster than 80.31% of C++ online submissions for Missing Number.
 * Memory Usage: 9.7 MB, less than 98.04% of C++ online submissions for Missing Number.
 *
 * 思路：求和，按 1-n 和减去实际 sum 就是丢掉的数
 */
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        if(nums.empty())
        	return 0;
        int size = nums.size();
        int sum = 0;
        
        for(int i = 0; i < size; i++) {
        	sum += nums[i];
        }

        return size * (size + 1) / 2 - sum;
    }
};