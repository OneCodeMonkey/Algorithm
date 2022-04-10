// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Largest Number After Digit Swaps by Parity.
// Memory Usage: 41.1 MB, less than 100.00% of Java online submissions for Largest Number After Digit Swaps by Parity.
// greedy
// T:O(logn * logn), S:O(logn)
// 
class Solution {
    public int largestInteger(int num) {
        int ret = num, numCopy = num;
        List<Integer> digits = new ArrayList<>();
        while (numCopy > 0) {
            digits.add(numCopy % 10);
            numCopy /= 10;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits.get(i) % 2 == 0) {
                int maxEvenDigit = -1, baseIndex = -1;
                for (int j = 0; j < i; j++) {
                    if (digits.get(j) % 2 == 0 && digits.get(j) > digits.get(i)) {
                        if (digits.get(j) > maxEvenDigit) {
                            maxEvenDigit = digits.get(j);
                            baseIndex = j;
                        }
                    }
                }
                if (maxEvenDigit != -1) {
                    ret = ret + (digits.get(baseIndex) - digits.get(i)) * ((int) Math.pow(10, i) - (int) Math.pow(10, baseIndex));
                    digits.set(baseIndex, digits.get(i));
                    digits.set(i, maxEvenDigit);
                }
            } else {
                int maxOddDigit = -1, baseIndex = -1;
                for (int j = 0; j < i; j++) {
                    if (digits.get(j) % 2 == 1 && digits.get(j) > digits.get(i)) {
                        if (digits.get(j) > maxOddDigit) {
                            maxOddDigit = digits.get(j);
                            baseIndex = j;
                        }
                    }
                }
                if (maxOddDigit != -1) {
                    ret = ret + (digits.get(baseIndex) - digits.get(i)) * ((int) Math.pow(10, i) - (int) Math.pow(10, baseIndex));
                    digits.set(baseIndex, digits.get(i));
                    digits.set(i, maxOddDigit);
                }
            }
        }

        return ret;
    }
}