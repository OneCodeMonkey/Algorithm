// Runtime 7 ms Beats 55.54%
// Memory 55.34 MB Beats 90.57%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<String> stringSequence(String target) {
        List<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            int c1 = c - 'a';
            for (int i = 0; i <= c1; i++) {
                char c2 = (char) ('a' + i);
                sb.append(c2);
                ret.add(sb.toString());
                if (i != c1) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return ret;
    }
}
