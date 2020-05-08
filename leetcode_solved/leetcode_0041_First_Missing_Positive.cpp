/**
 * Runtime: 4 ms, faster than 53.27% of C++ online submissions for First Missing Positive.
 * Memory Usage: 9.7 MB, less than 6.00% of C++ online submissions for First Missing Positive.
*/
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int size = nums.size();
        int currentSmallest = 1;

        while (1) {
        	for (int i = 0; i < size; i++) {
        		if (nums[i] == currentSmallest) {
        			currentSmallest++;
        			break;
        		}
        	}
        	return currentSmallest;
        }
    }
};