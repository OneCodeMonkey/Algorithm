/**
 * AC：
 * 思路：先按行预先计算出行的累加和，用一个 a[row + 2 * K][col + 2 * K] 的数组记录，
 *      然后在对 a 遍历，每个 [i][j] 位置累加 a[i][j] 到 a[i + 2 * K][j + 2 * K] 的K^2 个元素和
 *      这样总体复杂度是 O(m)(n)
 * T: O(m * n * K), 由于 K 是常数，所以接近 m * n 的复杂度
 */
class Solution {
public:
    vector<vector<int>> matrixBlockSum(vector<vector<int>>& mat, int K) {
        int row = mat.size(), col = mat[0].size();
        vector<vector<int>> ret(row, vector<int>(col, 0));
       	vector<vector<int>> record(row + 2 * K, vector<int>(row + 2 * K, 0));
       	for(int i = 0; i < row; i++) {
       		for(int j = 0; j < col; j++) {
       			for(int k = -K; k <= K; k++) {
       				if(j + k < 0 || j + k > col - 1)	// 左右越界的部分不计算行的累加和
       					continue;
       				record[i + K][j + K] += mat[i][j + k];
       			}
       		}
       	}

       	for(int i = 0; i < row; i++) {
       		for(int j = 0; j < col; j++) {
       			int temp = 0;
       			for(int k = -K; k <= K; k++) {
       				temp += record[i + K - k][j + K];
       			}
       			ret[i][j] = temp;
       		}
       	}

       	return ret;
    }
};