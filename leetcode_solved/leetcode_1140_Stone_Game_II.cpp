class Solution {
public:
	int solve(int record[101], int memo[101][101], int start, int M, int border) {
		if(start >= border)
			return 0;
		else if(memo[start][M] > 0)
			return memo[start][M];
		else {
			for(int i = 1; i <= 2 * M && start + i <= border; i++) {
				memo[start][M] = max(memo[start][M], record[start] - solve(record, memo, i + start, max(M, i), border));
			}
			return memo[start][M];
		}
	}
    int stoneGameII(vector<int>& piles) {
        int n = piles.size();
        int memo[101][101] = {0};
        int record[101] = {0};
        record[n - 1] = piles[n - 1];
        for(int i = n - 2; i >= 0; i--) {
        	record[i] = record[i + 1] + piles[i];
        }

        return solve(record, memo, 0, 1, n);
        
    }
};

