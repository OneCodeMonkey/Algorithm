class Solution {
public:
	bool isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    int getPrimesCount(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }
    long long getJieChen(int n) {
        long long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
            if (ans > (1000000000 + 7))
                ans = ans % (1000000000 + 7);
        }
        return ans;
    }
    long long numPrimeArrangements(int n) {
    	// 注意边界条件， 1 的时候不是返0而是返1，这里导致我一点点罚时。。。
        if (n == 1)
            return 1;
        long long primeCount = getPrimesCount(n);
        long long nonPrimeCount = n - primeCount;
        long long result = (getJieChen(primeCount) * getJieChen(nonPrimeCount)) % (1000000000 + 7);
        return result;
    }
};
