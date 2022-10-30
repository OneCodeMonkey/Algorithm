// AC: Runtime 4 ms Beats 50% 
// Memory 41.4 MB Beats 83.33%
// hashmap
// T:O(n * words[i].length), S:O(words[i].length)
// 
class Solution {
    public String oddString(String[] words) {
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, Integer> mapping = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder diff = new StringBuilder();
            for (int j = 0; j < words[i].length() - 1; j++) {
                diff.append(words[i].charAt(j + 1) - words[i].charAt(j));
                diff.append("#");
            }
            count.merge(diff.toString(), 1, Integer::sum);
            mapping.put(diff.toString(), i);
            if (count.size() > 1 && i >= 2) {
                for (String str : count.keySet()) {
                    if (count.get(str) == 1) {
                        return words[mapping.get(str)];
                    }
                }
            }
        }

        return null;
    }
}
