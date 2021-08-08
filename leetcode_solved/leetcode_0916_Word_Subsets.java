// AC: Runtime: 72 ms, faster than 9.44% of Java online submissions for Word Subsets.
// Memory Usage: 47 MB, less than 75.52% of Java online submissions for Word Subsets.
// using hashmap.
// T:O(max(sum(len(words1)), sum(len(words2)))), S:O(26) ~ O(1)
//
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character, Integer> universal = new HashMap<>();
        List<String> ret = new LinkedList<>();

        for (String str: words2) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char c: str.toCharArray()) {
                temp.merge(c, 1, Integer::sum);
            }
            // update universal word's every char count.
            for (char c: temp.keySet()) {
                int time = temp.get(c);
                if (universal.containsKey(c)) {
                    universal.put(c, Math.max(universal.get(c), time));
                } else {
                    universal.put(c, time);
                }
            }
        }

        for (String str: words1) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char c: str.toCharArray()) {
                temp.merge(c, 1, Integer::sum);
            }

            boolean flag = true;
            for (char c: universal.keySet()) {
                if (!temp.containsKey(c) || temp.get(c) < universal.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ret.add(str);
            }
        }

        return  ret;
    }
}