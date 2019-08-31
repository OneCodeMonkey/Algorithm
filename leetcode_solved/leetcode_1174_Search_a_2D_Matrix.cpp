class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size();	// 行数
        int col = matrix[0].size();	// 列数
        int i = 0;

        // 找到所在行
        while(!(target >= matrix[i][0] && target <= matrix[i][col])) {
        	i++;
        	if(i > row - 1)	// 所有行都不满足
        		return false;
        }

       	int left = 0;
       	int right = col - 1;
       	int mid = left + (right - left) / 2;
        if(matrix[i][mid] == target)
                return true;
       	while(left != right) {
         		if(matrix[i][mid] == target)
         			  return true;
         		else if(matrix[i][mid] > target) {
           			right = mid - 1;
           			mid = left + (right - left) / 2;
         		} else if(matrix[i][mid] < target) {
         			  left = mid + 1;
         			  mid = left + (right - left) / 2;
         		}
       	}
        return false;
    }
};
