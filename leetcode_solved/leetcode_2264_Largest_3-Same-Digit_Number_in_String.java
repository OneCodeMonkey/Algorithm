// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Largest 3-Same-Digit Number in String.
// Memory Usage: 42.7 MB, less than 66.67% of Java online submissions for Largest 3-Same-Digit Number in String.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String largestGoodInteger(String num) {
        char curMax = ' ';
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i + 1) == num.charAt(i)) {
                if (num.charAt(i + 2) == num.charAt(i)) {
                    if (num.charAt(i) > curMax) {
                        curMax = num.charAt(i);
                    }
                    i += 2;
                } else {
                    i += 1;
                }
            }
        }

        return curMax != ' ' ? String.valueOf(curMax).repeat(3) : "";
    }
}