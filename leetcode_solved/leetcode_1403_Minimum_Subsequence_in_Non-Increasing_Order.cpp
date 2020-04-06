/**
 * AC:Runtime: 16 ms, faster than 84.34% of C++ online submissions for Minimum Subsequence in Non-Increasing Order.
 * Memory Usage: 10.5 MB, less than 100.00% of C++ online submissions for Minimum Subsequence in Non-Increasing Order.
 * 
 * 思路：题目说的很绕，又要长度最短又要和最小，其实排序一次，然后从大到小累加判断，就满足所提出的条件。
 *
 */
class Solution {
private:
	static bool cmp(int x, int y) {
		return x > y;
	}
public:
    vector<int> minSubsequence(vector<int>& nums) {
  		vector<int> ansTmp;
  		int tempSum = 0, sum = 0;
  		sort(nums.begin(), nums.end(), cmp);
  		for(int i = 0; i < nums.size(); i++)
  			sum += nums[i];
  		for(int i = 0; i < nums.size(); i++) {
  			tempSum += nums[i];
  			ansTmp.push_back(nums[i]);
  			if (tempSum > sum - tempSum) {
  				return ansTmp;
  			}
  		}

  		return vector<int>();
    }
};