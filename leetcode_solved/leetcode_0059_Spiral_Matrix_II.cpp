/**
 * 模拟法
 * AC：
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Spiral Matrix II.
 * Memory Usage: 6.5 MB, less than 64.81% of C++ online submissions for Spiral Matrix II.
 *
 */
class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
    	if (n == 0) {
    		return vector<vector<int>> ();
    	}

        vector<vector<int>> ret(n, vector<int>(n, 0));
        int direction = 0;	// 0 向右，1向下，2向左，3向上
        int i = 0, j = 0, now = 1;

        while (now <= n * n) {
        	if (ret[i][j] == 0) {
        		ret[i][j] = now;
        	}

        	bool isExit = false;
        	switch (direction) {
        		case 0:
        			if (j + 1 > n - 1 || ret[i][j + 1] != 0) {
        				// 转变方向
        				direction = (direction + 1) % 4;

        				if (i + 1 > n - 1 || ret[i + 1][j] != 0) {
	        				// 无处转向，退出
	        				isExit = true;
	        			} else {
	        				i++;
	        				break;
	        			}
        			}
        			
        			j++;
        			break;
        		case 1:
        			if (i + 1 > n - 1 || ret[i + 1][j] != 0) {
        				direction = (direction + 1) % 4;

        				if (j - 1 < 0 || ret[i][j - 1] != 0) {
	        				isExit = true;
	        			} else {
	        				j--;
	        				break;
	        			}
        			}
        			
        			i++;
        			break;
        		case 2:
        			if (j - 1 < 0 || ret[i][j - 1] != 0) {
        				direction = (direction + 1) % 4;

        				if (i - 1 < 0 || ret[i - 1][j] != 0) {
	        				isExit = true;
	        			} else {
	        				i--;
	        				break;
	        			}
        			}
        			
        			j--;
        			break;
        		case 3:
        			if (i - 1 < 0 || ret[i - 1][j] != 0) {
        				direction = (direction + 1) % 4;

        				if (j + 1 > n - 1 || ret[i][j + 1] != 0) {
	        				isExit = true;
	        			} else {
	        				j++;
	        				break;
	        			}
        			}
        			
        			i--;
        			break;
        	}

        	if (isExit) {
        		return ret;
        	}
        	now++;
        }

        return ret;
    }
};