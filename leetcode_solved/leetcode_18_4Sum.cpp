class Solution {
public:
	/**
	 * 思路：先排序，然后以 O(n^2) 的复杂度做遍历，每一轮用两个游标缩小范围。
	 * 总体复杂度：O(n^2)
	 */
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
     	vector<vector<int> >ret;
     	int size = nums.size();
     	if(size < 4)
     		return vector<vector<int> >();

     	// sort
     	sort(nums.begin(), nums.end());

     	for(int i = 0; i < size - 1; i++) {
     		for(int j = i + 1; j < size; j++) {
     			int l = j + 1;
     			int r = size - 1;
     			while(l < r) {
     				int tempSum = nums[i] + nums[j] + nums[l] + nums[r];
     				if(tempSum == target) {
     					vector<int>tempArr;
     					tempArr.push_back(nums[i]);
     					tempArr.push_back(nums[j]);
     					tempArr.push_back(nums[l]);
     					tempArr.push_back(nums[r]);

     					// 去重
     					for(auto it:ret) {
     						if(it == tempArr) {
     							continue;
     						}
     					}

     					ret.push_back(tempArr);
                        break;
     				} else if(tempSum > target)
     					r--;
     				else if(tempSum < target)
     					l++;
     			}
     		}
     	}

     	return ret;
    }
};
