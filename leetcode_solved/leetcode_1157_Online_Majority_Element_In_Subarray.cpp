/**
 * Runtime: 160 ms, faster than 95.63% of C++ online submissions for Online Majority Element In Subarray.
 * Memory Usage: 46.6 MB, less than 100.00% of C++ online submissions for Online Majority Element In Subarray.
 *
 */
class MajorityChecker {
public:
	vector<int> a;
	unordered_map<int, vector<int>>idx;
    MajorityChecker(vector<int>& arr) {
        for(auto i = 0; i < arr.size(); i++)
        	idx[arr[i]].push_back(i);
        a = arr;
    }
    
    int query(int left, int right, int threshold) {
        for(int n = 0; n < 10; n++) {
        	auto i = idx.find(a[left + rand() % (right - left + 1)]);
        	if(i->second.size() < threshold)
        		continue;
        	if(upper_bound(begin(i->second), end(i->second), right) - lower_bound(begin(i->second), end(i->second), left) >= threshold)
        		return i->first;
        }

        return -1;
    }
};

/**
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker* obj = new MajorityChecker(arr);
 * int param_1 = obj->query(left,right,threshold);
 */
