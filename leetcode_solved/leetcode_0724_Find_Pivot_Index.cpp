/**
 * 思路：先求和。然后在 i 位置，判断 [0, i] 的和是否等于 (sum + a[i]) / 2
 *
 */
class Solution {
public:
    int pivotIndex(vector<int>& nums) {
    	int size = nums.size();
    	if(size == 0)
    		return -1;
    	if(size == 1)
    		return 0;

    	int sum = 0;
        for(auto num:nums) {
        	sum+= num;
        }

        int sumK = nums[0];		// 第0到i位的和
        for(int i = 0; i < size; i++) {
        	if(i !=0)
        		sumK += nums[i];
        	if(sumK * 2 == sum + nums[i])
        		return i;
        }

        return -1;
    }
};
