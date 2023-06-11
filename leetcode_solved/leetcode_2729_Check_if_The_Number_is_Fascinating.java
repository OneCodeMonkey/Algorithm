// AC: Runtime 2 ms Beats 57.14% 
// Memory 40.2 MB Beats 42.86%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean isFascinating(int n) {
        StringBuilder ret = new StringBuilder();
        ret.append(String.valueOf(n));
        ret.append(String.valueOf(2 * n));
        ret.append(String.valueOf(3 * n));
        if (ret.length() != 9) {
            return false;
        }
        boolean flag = true;
        HashSet<Character> countLetter = new HashSet<>();
        for (char c : ret.toString().toCharArray()) {
            if (c == '0') {
                flag = false;
                break;
            }
            countLetter.add(c);
        }

        return flag && countLetter.size() == 9;
    }
}
