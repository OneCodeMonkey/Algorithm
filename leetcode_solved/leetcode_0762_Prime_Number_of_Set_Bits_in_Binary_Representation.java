// AC: Runtime: 84 ms, faster than 13.67% of Java online submissions for Prime Number of Set Bits in Binary Representation.
// Memory Usage: 38.5 MB, less than 5.59% of Java online submissions for Prime Number of Set Bits in Binary Representation.
// brute-force :(
// 
// 
class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int ret = 0;
        for (int i = left; i <= right; i++) {
            int bitCount = 0;
            if (record.get(i / 2) == null) {
                int iCopy = i;
                while (iCopy > 0) {
                    if (iCopy % 2 == 1) {
                        bitCount++;
                    }
                    iCopy = iCopy >> 1;
                }
                record.put(i, bitCount);
            } else {
                bitCount = record.get(i / 2) + (i % 2);
                record.put(i, bitCount);
            }
            if (isPrime(bitCount)) {
                ret++;
            }
        }
        return ret;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int sqrtN = (int)Math.sqrt(n);
        for (int i = sqrtN; i >= 2; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}