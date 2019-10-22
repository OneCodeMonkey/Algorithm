/**
 * AC:
 * Runtime: 28 ms, faster than 93.42% of C++ online submissions for Range Sum Query - Immutable.
 * Memory Usage: 17.1 MB, less than 96.55% of C++ online submissions for Range Sum Query - Immutable.
 */
class NumArray {
public:
    NumArray(vector<int>& nums):record(nums.size() + 1, 0) {
        partial_sum(nums.begin(), nums.end(), record.begin() + 1);
    }
    
    int sumRange(int i, int j) {
  		return record[j + 1] - record[i];      
    }

private:
	vector<int> record;    
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(i,j);
 */