/**
 * AC：Runtime: 20 ms, faster than 34.84% of C++ online submissions for Single Number.
 * Memory Usage: 9.9 MB, less than 65.43% of C++ online submissions for Single Number.
 *
 */
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int ret = nums[0];
        int flag = false;	// ret 是否已配对
        for(int i = 1; i < nums.size(); i++) {
        	if(nums[i] == ret) {
        		flag = true;
        	} else {
        		if(flag == true) {
        			ret = nums[i];
        			flag = false;
        		} else {
        			return ret;
        		}
        	}
        }

    	return ret;
    }
};