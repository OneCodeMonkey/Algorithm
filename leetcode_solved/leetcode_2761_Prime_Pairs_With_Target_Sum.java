// AC: Runtime 1279 ms Beats 17.28% 
// Memory 50.2 MB Beats 93.61%
// Brute-force: basic prime judge
// T:O(n * sqrt(n)), S:O(n)
// 
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ret = new ArrayList<>();
        if (n >= 4) {
            if (n % 2 == 1) {
                if (isPrime(n - 2)) {
                    ret.add(Arrays.asList(2, n - 2));
                }
            } else {
                if (n == 4) {
                    ret.add(Arrays.asList(2, 2));
                } else {
                    for (int i = 3; i <= n / 2; i += 2) {
                        if (isPrime(i) && isPrime(n - i)) {
                            ret.add(Arrays.asList(i, n - i));
                        }
                    }
                }
            }
        }

        return ret;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
