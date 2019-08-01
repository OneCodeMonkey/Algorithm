class Solution {
public:
    /**
     * AC:
     * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Pow(x, n).
     * Memory Usage: 8.4 MB, less than 59.64% of C++ online submissions for Pow(x, n).
     *
     */
    double pow(double x, long long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        double value = pow(x, n / 2);
        value = value * value;
        if (n % 2) {
            value = value * x;
        }

        return value;
    }
    double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        double ans;
        if(n == INT_MIN) {
            x = 1 / x;
            ans = pow(x, - n - 1) * x;
            return ans;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        ans = pow(x, n);
        return ans;
    }
};