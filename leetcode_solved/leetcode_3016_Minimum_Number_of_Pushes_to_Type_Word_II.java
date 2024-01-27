// Runtime 58 ms Beats 47.25% of users with Java
// Memory 46.04 MB Beats 13.00% of users with Java
// Greedy: sort.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int minimumPushes(String word) {
        int len = word.length(), ret = 0;
        Map<Character, Integer> record = new HashMap<>();
        for (char c : word.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        Integer[] record2 = new Integer[record.size()];
        int pos = 0;
        for (char c : record.keySet()) {
            record2[pos++] = record.get(c);
        }
        Arrays.sort(record2, Collections.reverseOrder());
        for (int i = 0; i < record.size(); i++) {
            if (i < 8) {
                ret += 1 * record2[i];
            } else if (i < 16) {
                ret += 2 * record2[i];
            } else if (i < 24) {
                ret += 3 * record2[i];
            } else {
                ret += 4 * record2[i];
            }
        }

        return ret;
    }
}
