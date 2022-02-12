// AC: Runtime: 0 ms, faster than 100.00% of C++ online submissions for N-th Tribonacci Number.
// Memory Usage: 5.9 MB, less than 49.95% of C++ online submissions for N-th Tribonacci Number.
// recursion
// T:O(n), S:O(1)
// 
class Solution {
public:
	/**
	 * 送分题，参考求二阶斐波那契的 for 循环方法，稍作修改即可。
	 *
	 */
    int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int u = 0;
        int v = 1;
        int w = 1;
        int ret;
        for (int i = 3; i <= n; i++) {
            ret = u + v + w;
            u = v;
            v = w;
            w = ret;
        }

        return ret;
    }
};
