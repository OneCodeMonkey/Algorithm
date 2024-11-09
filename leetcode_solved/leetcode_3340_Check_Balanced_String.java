// Runtime 2 ms Beats 100.00%
// Memory 43.30 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return evenSum == oddSum;
    }
}
