class Solution {
public:
	/**
	 * 本题可以用一个无序映射表 unordered_map 记录 arr1 中各个元素的次数，
	 * 每当 arr2 中匹配中了一个数index，把 map[index] 减1，将结果保存入 返回的结果集
	 * 这样前一部分很好得到了，最后剩下的 map 中 key-value, 对 value > 1 的部分排序，再塞入结果集，则得到了第二部分。
	 *
	 * AC:
	 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Relative Sort Array.
	 * Memory Usage: 9.1 MB, less than 100.00% of C++ online submissions for Relative Sort Array.
	 *
	 */
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<int, int> record;
 		vector<int> ans;
 		for(auto it:arr1) {
 			record[it]++;		// 记录出现的次数
 		}

 		for(auto it:arr2) {		// 匹配的，塞入结果集，则得到排序的第一部分
 			for(int i = 0; i < record[it]; i++) {
 				ans.push_back(it);
 			}
 			record[it] = 0;
 		}

 		vector<int> rest;	// arr1 中塞完 arr2 后剩余的部分
 		for(auto it:record) {
 			while(it.second) {
 				rest.push_back(it.first);
 				it.second--;
 			}
 		}

 		sort(rest.begin(), rest.end());

 		for(auto it:rest) {
 			ans.push_back(it);
 		}

 		return ans;
    }
};
