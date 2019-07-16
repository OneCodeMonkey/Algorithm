class Solution {
public:
	/**
	 * Original Solution which complexity is O(n^3)
	 */
    int threeSumClosest(vector<int>& nums, int target) {
        int n = nums.size();
        int diff = target;
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n - 2; i++) {
        	for(int j = i + 1; j < n - 1; j++) {
        		for(int k = j + 1; k < n; k++) {
        			if(Math.abs(nums[i] + nums[j] + nums[k] - target) < diff) {	// 出现更接近的组合
        				sum = nums[i] + nums[j] + nums[k];
        			}
        		}
        	}
        }
    }
};
