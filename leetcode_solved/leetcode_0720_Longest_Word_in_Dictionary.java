// AC: Runtime: 14 ms, faster than 63.21% of Java online submissions for Longest Word in Dictionary.
// Memory Usage: 39.2 MB, less than 56.53% of Java online submissions for Longest Word in Dictionary.
// first sorting, and then using hashSet to store the prefix of history strings.
// T:O(nlogn * avg(strlen(str))), S:O(n * avg(strlen(str)))
//
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> record = new HashSet<>();
        String ret = "";
        for (String str: words) {
            if (str.length() == 1 || record.contains(str.substring(0, str.length() - 1))) {
                record.add(str);
                if (str.length() > ret.length()) {
                    ret = str;
                }
            }
        }
        
        return ret;
    }
}