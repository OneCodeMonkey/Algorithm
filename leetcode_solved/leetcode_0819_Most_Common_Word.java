// AC: Runtime: 25 ms, faster than 14.73% of Java online submissions for Most Common Word.
// Memory Usage: 41.8 MB, less than 5.23% of Java online submissions for Most Common Word.
// string replace should be careful.
// T:O(n), S:O(n), n is the number of the splitted word from paragraph.
// 
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("(?:(\\! )|(\\? )|(\\' )|(\\, )|(\\; )|(\\. ))", " ");
        paragraph = paragraph.replaceAll("(?:\\!|\\?|\\'|\\,|\\;|\\.)", " ");

        String[] strArr = paragraph.split(" ");
        HashMap<String, Integer> record = new HashMap<>();
        HashSet<String> ban = new HashSet<>();
        for (String str: banned) {
            ban.add(str.toLowerCase());
        }
        for (String str: strArr) {
            str = str.toLowerCase();
            if (!ban.contains(str)) {
                record.merge(str, 1, Integer::sum);
            }
        }
        int maxTime = 0;
        for (String str: record.keySet()) {
            if (record.get(str) > maxTime) {
                maxTime = record.get(str);
            }
        }
        for (String str: record.keySet()) {
            if (record.get(str) == maxTime) {
                return str;
            }
        }

        return "";
    }
}