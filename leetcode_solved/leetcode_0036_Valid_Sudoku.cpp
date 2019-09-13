/**
 * AC：
 * Runtime: 12 ms, faster than 89.95% of C++ online submissions for Valid Sudoku.
 * Memory Usage: 10.7 MB, less than 38.46% of C++ online submissions for Valid Sudoku.
 * 思路：没有什么简便算法，还是逐行，逐列，逐方块的检验。
 *
 */
class Solution {
public:
	bool check(vector<char> row) {
		vector<int> dp(10, 0);
		for (int i = 0; i < row.size(); i++) {
			int temp = row[i] - 48;	// 1 => '1'
			if (temp < 0)	// '.'
				continue;
			if (dp[temp] == 1)
				return false;
			dp[temp] = 1;
		}
		return true;
	}
	
	bool isValidSudoku(vector<vector<char>>& board) {
		int rowSize = board.size();
		int colSize = board[0].size();
		vector<char> row;
		vector<char> col;
		vector<char> square;

		for (int i = 0; i < rowSize; i++) {	// 横排
			row.clear();
			for (int j = 0; j < colSize; j++) {
				row.push_back(board[i][j]);
			}
			if (!check(row))
				return false;
		}

		for (int i = 0; i < colSize; i++) {	// 竖排
			col.clear();
			for (int j = 0; j < rowSize; j++) {
				col.push_back(board[j][i]);
			}
			if (!check(col))
				return false;
		}

		for (int t = 0; t < 3; t++) {		// 小九宫格
			for (int r = 0; r < 3; r++) {
				square.clear();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						square.push_back(board[i + 3 * t][j + 3 * r]);
					}
				}
				if (!check(square))
					return false;
			}
		}

		return true;
	}
    
};