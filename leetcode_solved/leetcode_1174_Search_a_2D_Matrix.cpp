class Solution {
public:
    /**
     * AC: 
     * Runtime: 8 ms, faster than 93.95% of C++ online submissions for Search a 2D Matrix.
     * Memory Usage: 9.7 MB, less than 100.00% of C++ online submissions for Search a 2D Matrix.
     * 注意这题的坑，假如 matrix 为空 vector， 或者为 “[[]]” (行1，列0)，都会引发数组index 错误的致命错误。
     * 类似的问题注意题目是否已给定非空，等等限制条件，否则一次错误提交就是大量的罚时，得不偿失。
     *
     */ 
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty() || matrix[0].empty())
            return false;
        int row = matrix.size();  // 行数
        int col = matrix[0].size(); // 列数
        int i = 0;
       

        // 找到所在行
        while(!(target >= matrix[i][0] && target <= matrix[i][col - 1])) {
          i++;
          if(i > row - 1) // 所有行都不满足
            return false;
        }

        int left = 0;
        int right = col - 1;
        int mid = left + (right - left) / 2;
        if(matrix[i][mid] == target)
                return true;
        while(left <= right) {
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
