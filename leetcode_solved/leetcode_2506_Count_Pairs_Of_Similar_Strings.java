// AC: Runtime 36 ms Beats 50% 
// Memory 51.4 MB Beats 12.50%
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public int similarPairs(String[] words) {
        int ret = 0;
        HashMap<String, Integer> record = new HashMap<>();
        for (String word : words) {
            TreeSet<Character> sign = new TreeSet<>();
            for (char c : word.toCharArray()) {
                sign.add(c);
            }
            StringBuilder str = new StringBuilder();
            for (char c : sign) {
                str.append(c);
            }
            record.merge(str.toString(), 1, Integer::sum);
        }
        for (String str : record.keySet()) {
            int time = record.get(str);
            if (time > 1) {
                ret += time * (time - 1) / 2;
            }
        }

        return ret;
    }
}
