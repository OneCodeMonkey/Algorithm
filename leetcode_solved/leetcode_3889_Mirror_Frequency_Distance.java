// Runtime 174 ms Beats 38.48% 
// Memory 79.30 MB Beats 19.42%
// Map.
// T:O(n), S:O(1)
// 
class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        int ret = 0;
        HashSet<Character> done = new HashSet<>();
        for (char c : record.keySet()) {
            if (done.contains(c)) {
                continue;
            }
            char c2;
            if (c >= '0' && c <= '9') {
                c2 = (char) ((9 - Integer.parseInt(String.valueOf(c))) + '0');
            } else {
                c2 = (char) (('z' - (int) c) + 'a');
            }
            if (done.contains(c2)) {
                continue;
            }

            int freq2 = record.getOrDefault(c2, 0);
            ret += Math.abs(record.get(c) - freq2);

            done.add(c);
            done.add(c2);
        }

        return ret;
    }
}
