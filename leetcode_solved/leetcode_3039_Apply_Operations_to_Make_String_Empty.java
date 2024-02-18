// Runtime 142 ms Beats 33.33% of users with Java
// Memory 56.10 MB Beats 33.33% of users with Java
// Hashmap.
// T:O(1), S:O(1)
// 
class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        int len = record.size(), pos = 0, maxCount = 0;
        int[][] count = new int[len][2];
        for (char c : record.keySet()) {
            count[pos++] = new int[]{c - 'a', record.get(c)};
            maxCount = Math.max(maxCount, record.get(c));
        }
        Arrays.sort(count, Comparator.comparingInt(a -> a[1]));
        StringBuilder ret = new StringBuilder();

        HashSet<Character> added = new HashSet<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (!added.contains(c) && record.get(c) == maxCount) {
                ret.append(c);
                added.add(c);
                if (added.size() == 26) {
                    break;
                }
            }
        }
        ret.reverse();

        return ret.toString();
    }
}
