/**
 * AC:
 * Runtime: 48 ms, faster than 68.54% of C++ online submissions for Count Primes.
 * Memory Usage: 8.7 MB, less than 75.00% of C++ online submissions for Count Primes.
 *
 * 思路：[3, t - 1], 用一个 n 长度数组记录是否是质数，从头开始标记。每次
 * 标记出以小数位倍数的位置，都为非质数。查表确定是否为质数。
 * T:O(nln(n)), S:O(n), ln(n) 是 (1/3+1/5+1/7+...) 通项公式的近似值
 */
class Solution {
public:
	int countPrimes(int n) {
        if (n<=2) return 0;
        vector<bool> passed(n, false);
        int sum = 1;
        int upper = sqrt(n);
        for (int i=3; i<n; i+=2) {
            if (!passed[i]) {
                sum++;
                //avoid overflow
                if (i>upper) continue;
                for (int j=i*i; j<n; j+=i) {
                    passed[j] = true;
                }
            }
        }
        return sum;
    }
};