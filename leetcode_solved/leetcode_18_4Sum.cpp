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

     					// 去重, 这里尝试直接 it == tempArr，结果不是想要的效果，即使值一样由于指针不一样也会判定为不一样。所以挨个比较值
     					// 这里也体现出 C++ 的语言不方便性，换其他语言比如 php，直接 一个 exist() 就能完成的事。
                        int flag = 0;
     					for(auto it:ret) {
     						if(it[0] == tempArr[0] && it[1] == tempArr[1] && it[2] == tempArr[2] && it[3] == tempArr[3]) {
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
