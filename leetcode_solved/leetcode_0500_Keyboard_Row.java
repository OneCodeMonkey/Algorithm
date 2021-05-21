// AC: Runtime: 1 ms, faster than 43.22% of Java online submissions for Keyboard Row.
// Memory Usage: 37.2 MB, less than 35.77% of Java online submissions for Keyboard Row.
// hashset
// T:O(n), S:O(n)
// 
class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'));
        HashSet<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'));
        HashSet<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'));
        List<String> ret = new LinkedList<>();
        for (String str: words) {
            if (str.length() == 1) {
                ret.add(str);
                continue;
            }
            char c = str.charAt(0);
            int index = 0;
            if (row1.contains(c)) {
                index = 1;
            }
            if (row2.contains(c)) {
                index = 2;
            }
            if (row3.contains(c)) {
                index = 3;
            }
            boolean flag = true;
            for (int i = 1; i < str.length(); i++) {
                int index2 = 0;
                c = str.charAt(i);
                if (row1.contains(c)) {
                    index2 = 1;
                }
                if (row2.contains(c)) {
                    index2 = 2;
                }
                if (row3.contains(c)) {
                    index2 = 3;
                }
                if (index2 != index) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ret.add(str);
            }
        }
        String[] retArr = new String[ret.size()];
        int pos = 0;
        for (String str: ret) {
            retArr[pos++] = str;
        }
        return retArr;
    }
}