class Solution {
public:
	/**
	 * AC: 
	 * Runtime: 48 ms, faster than 30.52% of C++ online submissions for 4Sum.
	 * Memory Usage: 10.6 MB, less than 11.68% of C++ online submissions for 4Sum.
	 *
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

     					int flag = 0;
     					for(auto it:ret) {
     						if(it == tempArr) {
     							flag = 1;
                                break;
     						}
     					}
                        if(flag) {
                            l++;
                            continue;
                        }

     					ret.push_back(tempArr);
                        // break;       // 这里不应该直接退出，因为第三四个有可能有多种满足的组合
                        l++;
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
