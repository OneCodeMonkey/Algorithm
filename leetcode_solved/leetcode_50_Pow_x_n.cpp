class Solution {
public:
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