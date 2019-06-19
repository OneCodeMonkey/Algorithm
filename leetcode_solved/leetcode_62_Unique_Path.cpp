class Solution {
public:
	int uniquePaths(int m, int n) {
		int t = m + n - 2;
		int s = n - 1;
		long result = 1;
		for (int i = m, j = 1; i <= t; i++, j++) {
			result = result * i / j;
		}
		return result;
	}
};
