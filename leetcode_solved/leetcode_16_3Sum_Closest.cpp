class Solution {
public:
	/**
	 * Original Solution which complexity is O(n^3)
	 */
    // int threeSumClosest(vector<int>& nums, int target) {
    //     int n = nums.size();
    //     int diff = target;
    //     int sum = nums[0] + nums[1] + nums[2];
    //     for(int i = 0; i < n - 2; i++) {
    //     	for(int j = i + 1; j < n - 1; j++) {
    //     		for(int k = j + 1; k < n; k++) {
    //     			if(Math.abs(nums[i] + nums[j] + nums[k] - target) < diff) {	// 出现更接近的组合
    //     				sum = nums[i] + nums[j] + nums[k];
    //     			}
    //     		}
    //     	}
    //     }
    // }

    /**
     * qualified solution with complexity of O(n^2)
     */
    int threeSumClosest(vector<int>& nums, int target) {
        int n = nums.size();
        int ret = nums[0] + nums[1] + nums[2];	// assume the first result
        // special case, straightly return
        if(n == 3)
        	return ret;

        // sort
        sort(nums.begin(), nums.end());

        for(int i = 0; i < n - 2; i++) {
        	int j = i + 1;
        	int k = n - 1;
        	while(j < k) {	// search with both directions
        		int sum = nums[i] + nums[j] + nums[k];
        		if(abs(sum - target) < abs(ret - target)) {		// better choice
        			ret = sum;

        			// if exactly equals to answer, directly return!
        			if(ret == target)
        				return ret;
        		}
        		// move index
        		if(sum > target)
        			k--;
        		else
        			j++;
        	}
        }

        return ret;
    }
};
