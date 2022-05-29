// AC: Runtime: 21 ms, faster than 6.46% of Java online submissions for Find Resultant Array After Removing Anagrams.
// Memory Usage: 45 MB, less than 77.00% of Java online submissions for Find Resultant Array After Removing Anagrams.
// hashmap count characters.
// T:O(sum(words[i].length)), S:O(max(words[i].length))
// 
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ret = new LinkedList<>();
        HashMap<Character, Integer> former = new HashMap<>(), current = new HashMap<>();
        ret.add(words[0]);
        for (char c : words[0].toCharArray()) {
            former.merge(c, 1, Integer::sum);
        }
        for (int i = 1; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                current.merge(c, 1, Integer::sum);
            }
            boolean flag = true;
            if (words[i - 1].length() == words[i].length() && former.size() == current.size()) {
                boolean flag2 = true;
                for (char c : former.keySet()) {
                    if (!current.containsKey(c) || !current.get(c).equals(former.get(c))) {
                        flag2 = false;
                        break;
                    }
                }
                if (flag2) {
                    flag = false;
                }
            }
            if (flag) {
                ret.add(words[i]);
                former = new HashMap<>(current);
            }
            current.clear();
        }

        return ret;
    }
}