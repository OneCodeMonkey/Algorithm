// AC: Runtime: 4 ms, faster than 74.27% of Java online submissions for Reformat The String.
// Memory Usage: 39.1 MB, less than 67.64% of Java online submissions for Reformat The String.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String reformat(String s) {
        int letterCount = 0, digitCount = 0;
        List<Character> letter = new ArrayList<>();
        List<Character> digit = new ArrayList<>();
        for (char c: s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterCount++;
                letter.add(c);
            } else {
                digitCount++;
                digit.add(c);
            }
        }
        if (Math.abs(letterCount - digitCount) > 1) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        if (letterCount > digitCount) {
            for (int i = 0; i < digitCount; i++) {
                ret.append(letter.get(i));
                ret.append(digit.get(i));
            }
            ret.append(letter.get(letterCount - 1));
        } else {
            for (int i = 0; i < letterCount; i++) {
                ret.append(digit.get(i));
                ret.append(letter.get(i));
            }
            if (digitCount > letterCount) {
                ret.append(digit.get(digitCount - 1));
            }
        }

        return ret.toString();
    }
}