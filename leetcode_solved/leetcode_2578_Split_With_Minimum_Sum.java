// AC: Runtime 1 ms Beats 50% 
// Memory 39.1 MB Beats 50%
// .
// T:O(logn), S:O(logn)
// 
class Solution {
    public int splitNum(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }
        Collections.sort(digits);
        StringBuilder num1 = new StringBuilder(), num2 = new StringBuilder();
        for (int i = 0; i < digits.size(); i++) {
            if (i % 2 == 0) {
                num1.append(digits.get(i));
            } else {
                num2.append(digits.get(i));
            }
        }

        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
    }
}
