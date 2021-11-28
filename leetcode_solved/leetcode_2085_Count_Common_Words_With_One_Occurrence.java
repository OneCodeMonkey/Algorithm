// AC: Runtime: 4 ms, faster than 100.00% of Java online submissions for Count Common Words With One Occurrence.
// Memory Usage: 39.3 MB, less than 90.00% of Java online submissions for Count Common Words With One Occurrence.
// .
// T:O(m+n), S:O(m+n), m, n is length of two arrays.
// 
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashSet<String> record = new HashSet<>();
        HashSet<String> record1 = new HashSet<>();
        HashSet<String> record2 = new HashSet<>();
        for (String str: words1) {
            if (!record.contains(str)) {
                record1.add(str);
                record.add(str);
            } else {
                record1.remove(str);
            }
        }
        record = new HashSet<>();
        for (String str: words2) {
            if (!record.contains(str)) {
                record2.add(str);
                record.add(str);
            } else {
                record2.remove(str);
            }
        }
        int ret = 0;
        for (String str: record1) {
            if (record2.contains(str)) {
                ret++;
            }
        }

        return ret;
    }
}