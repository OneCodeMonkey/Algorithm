// AC:
// Runtime: 3 ms, faster than 35.79% of Java online submissions for Add Strings.
// Memory Usage: 38.9 MB, less than 59.09% of Java online submissions for Add Strings.
// .
// T:O(max(len(num1), len(num2))), O(len(num1) + (num2))
//
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ret = new StringBuilder();
        int cursor = 0, forwardBit = 0, bit1, bit2;
        // 翻转num1,num2
        StringBuilder num1Sb = new StringBuilder(num1);
        num1 = num1Sb.reverse().toString();
        StringBuilder num2Sb = new StringBuilder(num2);
        num2 = num2Sb.reverse().toString();
        while (cursor < num1.length() || cursor < num2.length()) {
            if (cursor < num1.length()) {
                bit1 = Integer.parseInt(String.valueOf(num1.charAt(cursor)));
            } else {
                bit1 = 0;
            }
            if (cursor < num2.length()) {
                bit2 = Integer.parseInt(String.valueOf(num2.charAt(cursor)));
            } else {
                bit2 = 0;
            }
            ret.append((bit1 + bit2 + forwardBit) % 10);
            forwardBit = (bit1 + bit2 + forwardBit >= 10 ? 1 : 0);
            cursor++;
        }
        // 若最后 forwardBit 大于1，还要补进一位
        if (forwardBit == 1) {
            ret.append(forwardBit);
        }
        return ret.reverse().toString();
    }
}