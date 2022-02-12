// AC: Runtime: 3 ms, faster than 74.08% of Java online submissions for Smallest Value of the Rearranged Number.
// Memory Usage: 39.5 MB, less than 91.17% of Java online submissions for Smallest Value of the Rearranged Number.
// greedy.
// T:O(logn * log(logn)), S:O(logn)
// 
class Solution {
    public long smallestNumber(long num) {
        List<Long> digits = new ArrayList<>();
        int zeroCount = 0;
        boolean isPositive = true;
        if (num < 0) {
            isPositive = false;
            num = -num;
        }
        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                zeroCount++;
            } else {
                digits.add(digit);
            }
            num /= 10;
        }
        if (isPositive) {
            Collections.sort(digits);
            for (int i = 0; i < zeroCount; i++) {
                digits.add(1, 0L);
            }
        } else {
            digits.sort(new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    return (int) (o2 - o1);
                }
            });
            for (int i = 0; i < zeroCount; i++) {
                digits.add(digits.size(), 0L);
            }
        }
        long ret = 0, base = 1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            ret += digits.get(i) * base;
            base *= 10;
        }
        return ret * (isPositive ? 1 : -1);
    }
}