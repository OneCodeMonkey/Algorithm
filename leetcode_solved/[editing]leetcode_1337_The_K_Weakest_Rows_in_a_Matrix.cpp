class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
    	int row = mat.size(), col = mat[0].size(), temp;
        unordered_map<int, int> record;
        vector<int> ret;
        
        for (int i = 0; i < row; i++) {
        	temp = 0;
        	for (int j = 0; j < col; j++) {
        		temp += mat[i][j];
        	}
        	record[i] = temp;
        }

        // 按照 key/value 的 value 排序。
        std::sort(record.begin(), record.end(), [=](std::pair<int, int>& a, std::pair<int, int>& b) { return a.second < b.second; });

        int count = 0;
        unordered_map<int, int>::iterator iter = record.begin();
        while (iter != record.end() && count < k) {
        	ret.push_back(iter->first);
        	count++;
        }

        return ret;
    }
};