// AC:
// Runtime: 5 ms, faster than 100.00% of Java online submissions for Sorting the Sentence.
// Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Sorting the Sentence.
// Using tree map to sort key.
// T:O(n), S:O(n), n = len(s)
//
class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer, String> record = new TreeMap<>();
        String[] sArr = s.split(" ");
        for (String item: sArr) {
            Integer index = Integer.parseInt(String.valueOf(item.charAt(item.length() - 1)));
            record.put(index, item.substring(0, item.length() - 1));
        }
        StringBuilder ret = new StringBuilder();
        for (Integer i: record.keySet()) {
            ret.append(record.get(i));
            ret.append(" ");
        }
        return ret.substring(0, ret.length() - 1);
    }
}