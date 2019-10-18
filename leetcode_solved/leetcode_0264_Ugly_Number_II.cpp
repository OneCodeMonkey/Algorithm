/**
 * AC：
 * Runtime: 8 ms, faster than 74.43% of C++ online submissions for Ugly Number II.
 * Memory Usage: 9.7 MB, less than 100.00% of C++ online submissions for Ugly Number II.
 *
 * 思路：DP
 */
class Solution {
public:
    int nthUglyNumber(int n) {
        if(n == 0)		//失败
        	return 0;
        if(n == 1)
        	return 1;

        int pow2 = 0, pow3 = 0, pow5 = 0;	// 记录 2，3，5 的幂

        vector<int> k(n + 1);
        k[1] = 1;		// 第一个满足的为 1

        for(int i = 1; i < n; i++) {
        	k[i + 1] = min(k[pow2 + 1] * 2, min(k[pow3 + 1] * 3, k[pow5 + 1] * 5));
        	if(k[i + 1] == k[pow2 + 1] * 2)
        		pow2++;
        	if(k[i + 1] == k[pow3 + 1] * 3)
        		pow3++;
        	if(k[i + 1] == k[pow5 + 1] * 5)
        		pow5++;
        }

        return k[n];
    }
};