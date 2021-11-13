// AC: Runtime: 45 ms, faster than 57.45% of Java online submissions for Evaluate the Bracket Pairs of a String.
// Memory Usage: 85.8 MB, less than 45.04% of Java online submissions for Evaluate the Bracket Pairs of a String.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> record = new HashMap<>();
        for (List<String> pair: knowledge) {
            record.put(pair.get(0), pair.get(1));
        }
        StringBuilder ret = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean sign = false;
        for (Character c: s.toCharArray()) {
            if (c == '(') {
                sign = true;
            } else if (c == ')') {
                ret.append(record.getOrDefault(temp.toString(), "?"));
                sign = false;
                temp = new StringBuilder();
            } else {
                if (sign) {
                    temp.append(c);
                } else {
                    ret.append(c);
                }
            }
        }

        return ret.toString();
    }
}