/**
 * AC:
 * Runtime: 20 ms, faster than 78.55% of C++ online submissions for Majority Element.
 * Memory Usage: 11 MB, less than 96.97% of C++ online submissions for Majority Element.
 */
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int ans = nums[0], count = 1;
        for(int i = 1; i < nums.size(); i++) {
        	if(count == 0) {
        		count++;
        		ans = nums[i];
        	} else if(ans == nums[i]) {
        		count++;
        	} else {
        		count--;
        	}
        }
        return ans;
    }
};