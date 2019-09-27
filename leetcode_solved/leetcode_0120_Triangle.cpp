class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        vector<int>record(triangle.back());
        for(int i = n - 2; i >= 0; i--) {
        	for(int j = 0; j <= i; j++) {
        		record[j] = min(record[j], record[j + 1]) + triangle[i][j];
        	}
        }

        return record[0];
    }
};