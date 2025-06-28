// Runtime 3 ms Beats 100% 
// Memory 42.62 MB Beats 100%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : nums) {
            record.merge(i, 1, Integer::sum);
        }
        for (int key : record.keySet()) {
            if (isPrime(record.get(key))) {
                return true;
            }
        }

        return false;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int sqrtN = (int) Math.sqrt(n);
        for (int i = sqrtN; i >= 2; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

