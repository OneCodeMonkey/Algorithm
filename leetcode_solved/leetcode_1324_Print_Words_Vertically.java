// AC: Runtime: 2 ms, faster than 50.68% of Java online submissions for Print Words Vertically.
// Memory Usage: 42.4 MB, less than 10.14% of Java online submissions for Print Words Vertically.
// 2d-array to store chars.
// T:O(m * max(n)), S:O(m * max(n)), m is word count, n is word length.
// 
class Solution {
    public List<String> printVertically(String s) {
        String[] sArr = s.trim().split(" ");
        List<List<Character>> record = new ArrayList<>();
        int maxLen = 0;
        for (String str:sArr) {
            maxLen = Math.max(str.length(), maxLen);
        }
        for (int i = 0; i < maxLen; i++) {
            record.add(new LinkedList<>());
        }
        for (String str: sArr) {
            for (int i = 0; i < str.length(); i++) {
                record.get(i).add(str.charAt(i));
            }
            for (int i = str.length(); i < maxLen; i++) {
                record.get(i).add(' ');
            }
        }
        List<String> ret = new LinkedList<>();
        for (List<Character> charSeq: record) {
            StringBuilder temp = new StringBuilder();
            Collections.reverse(charSeq);
            boolean flag = false;
            for (char c: charSeq) {
                if (flag || c != ' ') {
                    temp.append(c);
                    flag = true;
                }
            }
            ret.add(temp.reverse().toString());
        }
        return ret;
    }
}