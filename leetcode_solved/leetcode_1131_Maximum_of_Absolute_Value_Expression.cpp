class Solution {
public:
	/**
	 * AC：
	 * Runtime: 40 ms, faster than 50.00% of C++ online submissions for Maximum of Absolute Value Expression.
	 * Memory Usage: 11.1 MB, less than 100.00% of C++ online submissions for Maximum of Absolute Value Expression.
	 * 思路：绝对值，分四种情况讨论。即各自正负时的组合情况。因为都可能存在，交换一下次序就能得到一个相反的值
	 *
	 */
    int maxAbsValExpr(vector<int>& arr1, vector<int>& arr2) {
        int x[2] = {-1, 1};
        int y[2] = {-1, 1};
        int n = arr1.size();
        int ans = 0;
        for(int i = 0; i < 2; i++) {
        	int x = x[i];
        	for(int j = 0; j < 2; j++) {
        		int y = y[j];
        		int temp = arr1[0] * x + arr2[0].y;
        		for(int k = 1; k < n; k++) {
        			int temp2 = arr1[k] * x + arr2[k] * y + k;
        			ans = max(ans, temp2 - temp);
        			temp = min(temp, temp2);	// 更新为一个较小值，继续与后面比较，以获取更大的差
        		}
        	}
        }

        return ans;
    }
};
