// Runtime 8 ms Beats 100.00% 
// Memory 45.52 MB Beats 100.00%
// .
// T:O(n^2), S:O(n)
// 
class Solution {
    public boolean hasSameDigits(String s) {
        List<Integer> digits = new ArrayList<>();
        for (char c : s.toCharArray()) {
            digits.add(c - '0');
        }
        while (digits.size() > 2) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < digits.size() - 1; i++) {
                tmp.add((digits.get(i) + digits.get(i + 1)) % 10);
            }
            digits = tmp;
        }

        return digits.get(0) == digits.get(1);
    }
}
