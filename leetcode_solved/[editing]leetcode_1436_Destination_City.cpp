class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        int pathSize = paths.size();
        vector<int> record(pathSize, 0);
        string left = paths[0][0],right = paths[0][1];

        for (int i = 0; i < pathSize; i++) {
        	record[i] = 1;
        	for (int j = i + 1; j < pathSize; j++) {
        		if (record[j]) {
        			continue;
        		}

        		if (paths[i][0] == paths[j][1]) {
        			left = paths[j][0];
        			right = paths[i][1];
        			record[j] = 1;
        		} else if (paths[i][1] == paths[j][0]) {
					left = paths[i][0];
        			right = paths[j][1];
        			record[j] = 1;
        		}
        	}
        }

        return right;
    }
};