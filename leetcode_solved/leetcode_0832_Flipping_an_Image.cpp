/**
 * AC:
 * Runtime: 8 ms, faster than 80.29% of C++ online submissions for Flipping an Image.
 * Memory Usage: 9.2 MB, less than 7.07% of C++ online submissions for Flipping an Image.
 *
 */
class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& A) {
        int row = A.size();
        int col = A[0].size();

        for (int i = 0; i <= row - 1 ; i++) {
        	for (int j = 0; j < col / 2; j++) {
        		int temp = A[i][j];
        		A[i][j] = A[i][col - 1 - j];
        		A[i][col - 1 - j] = temp;
        	}
        }

        for (int i = 0; i <= row - 1 ; i++) {
        	for (int j = 0; j <= col - 1; j++) {
        		if (A[i][j] == 0) {
        			A[i][j] = 1;
        		} else {
        			A[i][j] = 0;
        		}
        	}
        }

        return A;
    }
};
