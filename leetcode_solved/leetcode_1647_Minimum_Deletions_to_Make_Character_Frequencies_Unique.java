// AC: Runtime: 121 ms, faster than 10.27% of Java online submissions for Minimum Deletions to Make Character Frequencies Unique.
// Memory Usage: 66.5 MB, less than 23.78% of Java online submissions for Minimum Deletions to Make Character Frequencies Unique.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        List<Integer> counts = new ArrayList<>();
        for (char c : record.keySet()) {
            counts.add(record.get(c));
        }
        Collections.sort(counts);
        int ret = 0, prev = -1;
        for (int i = counts.size() - 1; i >= 0; i--) {
            if (prev == -1) {
                prev = counts.get(i);
            } else {
                if (counts.get(i) < prev) {
                    prev = counts.get(i);
                } else if (counts.get(i) == prev) {
                    ret += prev + 1 - counts.get(i);
                    prev = prev >= 1 ? prev - 1 : 0;
                } else {
                    ret += prev >= 1 ? counts.get(i) - prev + 1 : counts.get(i);
                    prev = prev >= 1 ? prev - 1 : 0;
                }
            }
        }

        return ret;
    }
}