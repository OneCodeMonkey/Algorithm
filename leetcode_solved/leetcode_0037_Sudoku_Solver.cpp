/**
 * AC：
 * Runtime: 1452 ms, faster than 5.04% of C++ online submissions for Sudoku Solver.
 * Memory Usage: 324.9 MB, less than 6.90% of C++ online submissions for Sudoku Solver.
 *
 * 思路：朴实的 DFS 法，效率不高。。。
 */
class Solution {
public:
	bool Check(int n, int key, vector<vector<char>> board) {
    	char temp = key + 48;
    	for(int i = 0; i < 9; i++) {	// 横坐标是否合法
    		int j = n / 9;
    		if(board[j][i] == temp)
    			return false;
    	}
    	for(int i = 0; i < 9; i++) {	// 纵坐标是否合法
    		int j = n % 9;
    		if(board[i][j] == temp)
    			return false;
    	}

    	int x = n / 9 / 3 * 3;
    	int y = n % 9 / 3 * 3;

    	for(int i = x; i < x + 3; i++) {	// 小宫格是否合法
    		for(int j = y; j < y + 3; j++) {
    			if(board[i][j] == temp)
    				return false;
    		}
    	}

    	return true;
    }

    int DFS(int n, vector<vector<char>> & board, bool &isSuccess) {
    	if(n > 80) {
    		isSuccess = true;
    		return 0;
    	}
    	if(board[n / 9][n % 9] != '.') {
    		DFS(n + 1, board, isSuccess);
    	}
    	else {
    		for(int i = 1; i <= 9; i++) {
    			if(Check(n, i, board) == true) {
    				char temp = i + 48;
    				board[n / 9][n % 9] = temp;
    				DFS(n + 1, board, isSuccess);
    				if(isSuccess == true)
    					return 0;
    				board[n / 9][n % 9] = '.';
    			}
    		}
    	}

    	return 0;
    }

    void solveSudoku(vector<vector<char>>& board) {
    	bool isSuccess = false;		// 数独是否已被解决
       	DFS(0, board, isSuccess);
    }
};


// Solution 2:

class Solution {
public:
    void solveSudoku(vector<vector<char>>& board) {
        solve(board);
    }

private:
    bool solve(vector<vector<char>>& board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    bool isValid(vector<vector<char>>& board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        int startRow = (row / 3) * 3, startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }
};
