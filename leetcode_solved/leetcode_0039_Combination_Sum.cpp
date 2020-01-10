class Solution {
public:
	void DFS(int left, int ptr, vector<int>& candidates, vector<vector<int>>& ret, vector<int>& pre) {
		if(left == 0) {
			ret.push_back(pre);
			return;
		}
		while(ptr < candidates.size() && candidates[ptr] > left) {
			ptr += 1;
		}
		for(int i = ptr; i < candidates.size(); i++) {
			pre.push_back(candidates[i]);
			DFS(left - candidates[i], i, candidates, ret, pre);
			pre.pop_back();
		}
		return;
	}
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        sort(candidates.begin(), candidates.end(), greater<int>());	// 先排序
        vector<vector<int>> ret;
        vector<int> pre;
        DFS(target, 0, candidates, ret, pre);
        return ret;
    }
};