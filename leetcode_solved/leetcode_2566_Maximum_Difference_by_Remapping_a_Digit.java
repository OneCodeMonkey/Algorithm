// AC: Runtime 2 ms Beats 33.33% 
// Memory 39 MB Beats 83.33%
// .
// T:O(max(logn)), S:O(logn)
// 
class Solution {
    public int minMaxDifference(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        StringBuilder min = new StringBuilder(), max = new StringBuilder();
        int firstNonZeroDigit = 0, firstNonNineDigit = -1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (firstNonZeroDigit == 0) {
                firstNonZeroDigit = digits.get(i);
                min.append(0);
            } else {
                if (digits.get(i) == firstNonZeroDigit) {
                    min.append(0);
                } else {
                    min.append(digits.get(i));
                }
            }

            if (firstNonNineDigit == -1) {
                if (digits.get(i) != 9) {
                    firstNonNineDigit = digits.get(i);
                }
                max.append(9);
            } else {
                if (digits.get(i) == firstNonNineDigit) {
                    max.append(9);
                } else {
                    max.append(digits.get(i));
                }
            }
        }

        return Integer.parseInt(max.toString()) - Integer.parseInt(min.toString());
    }
}
