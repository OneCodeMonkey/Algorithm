// Runtime 5 ms Beats 35.91% 
// Memory 42.92 MB Beats 24.33%
// .
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int sumOfPrimesInRange(int n) {
        int ret = 0, rev = getReverse(n);
        for (int i = Math.min(rev, n); i <= Math.max(rev, n); i++) {
            if (isPrime(i)) {
                ret += i;
            }
        }

        return ret;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    private int getReverse(int n) {
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }
}
