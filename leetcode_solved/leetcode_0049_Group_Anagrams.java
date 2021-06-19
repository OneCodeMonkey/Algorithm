// AC: Runtime: 22 ms, faster than 15.63% of Java online submissions for Group Anagrams.
// Memory Usage: 42.9 MB, less than 32.67% of Java online submissions for Group Anagrams.
// hashmap and treemap
// T:(strs.length() * strlen(strs[i])), S:O(strs.length() * strlen(strs[i]))
// 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new LinkedList<>();
        HashMap<String, Integer> stringToIndex = new HashMap<>();
        for (String s: strs) {
            TreeMap<Character, Integer> record = new TreeMap<>();
            for (char c: s.toCharArray()) {
                record.merge(c, 1, Integer::sum);
            }
            StringBuilder temp = new StringBuilder();
            for (char c: record.keySet()) {
                temp.append(c);
                temp.append(record.get(c));
            }
            String tempStr = temp.toString();
            if (stringToIndex.get(tempStr) == null) {
                List<String> tempList = new LinkedList<>();
                tempList.add(s);
                ret.add(tempList);
                stringToIndex.put(tempStr, ret.size() - 1);
            } else {
                ret.get(stringToIndex.get(tempStr)).add(s);
            }
        }
        
        return ret;
    }
}