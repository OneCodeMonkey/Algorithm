class Solution {
public:
	bool checkRow(vector<char> row) {
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
	bool checkCol(vector<char> col) {
		vector<int> dp(10, 0);
		for (int i = 0; i < col.size(); i++) {
			int temp = col[i] - 48;	// 1 => '1'
			if (temp < 0)	// '.'
				continue;
			if (dp[temp] == 1)
				return false;
			dp[temp] = 1;
		}
		return true;
	}
	bool checkSquare(vector<char> vec) {
		vector<int> dp(10, 0);
		for (int i = 0; i < vec.size(); i++) {
			int temp = vec[i] - 48;	// 1 => '1'
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
			if (!checkRow(row))
				return false;
		}

		for (int i = 0; i < colSize; i++) {	// 竖排
			col.clear();
			for (int j = 0; j < rowSize; j++) {
				col.push_back(board[j][i]);
			}
			if (!checkCol(col))
				return false;
		}

		for (int t = 0; t < 3; t++) {		// 小九宫格
			square.clear();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					square.push_back(board[i + 3 * t][j + 3 * t]);
				}
			}
			if (!checkSquare(square))
				return false;
		}

		return true;
	}
    
};