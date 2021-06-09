// AC: Runtime: 3 ms, faster than 40.02% of Java online submissions for Uncommon Words from Two Sentences.
// Memory Usage: 39 MB, less than 40.02% of Java online submissions for Uncommon Words from Two Sentences.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashSet<String> ret = new HashSet<>();
        HashMap<String, Integer> record1 = new HashMap<>();
        HashMap<String, Integer> record2 = new HashMap<>();
        for (String s : arr1) {
            record1.merge(s, 1, Integer::sum);
        }
        for (String s : arr2) {
            record2.merge(s, 1, Integer::sum);
        }
        for (String s : arr1) {
            if (record1.get(s) == 1 && !record2.containsKey(s)) {
                ret.add(s);
            }
        }
        for (String s : arr2) {
            if (record2.get(s) == 1 && !record1.containsKey(s)) {
                ret.add(s);
            }
        }
        String[] retArr = new String[ret.size()];
        int pos = 0;
        for (String s : ret) {
            retArr[pos++] = s;
        }

        return retArr;
    }
}