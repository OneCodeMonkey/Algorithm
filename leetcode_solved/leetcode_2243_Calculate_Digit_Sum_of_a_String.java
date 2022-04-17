// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Calculate Digit Sum of a String.
// Memory Usage: 40.7 MB, less than 80.00% of Java online submissions for Calculate Digit Sum of a String.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sTemp = new StringBuilder();
            int countDigit = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % k == 0) {
                    if (i != 0) {
                        sTemp.append(countDigit);
                    }
                    countDigit = 0;
                }
                countDigit += s.charAt(i) - '0';
            }
            sTemp.append(countDigit);
            s = sTemp.toString();
        }

        return s;
    }
}