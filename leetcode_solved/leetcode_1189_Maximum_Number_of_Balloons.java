// AC: Runtime: 4 ms, faster than 41.44% of Java online submissions for Maximum Number of Balloons.
// Memory Usage: 38.9 MB, less than 28.53% of Java online submissions for Maximum Number of Balloons.
// .
// T:O(n), S:O(max(n, 26))
// 
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> record = new HashMap<>();
        HashSet<Character> balloon = new HashSet<>();
        for (char c: "balloon".toCharArray()) {
            balloon.add(c);
        }
        for (char c: text.toCharArray()) {
            if (balloon.contains(c)) {
                record.merge(c, 1, Integer::sum);
            }
        }
        for (char c: balloon) {
            if (!record.containsKey(c)) {
                return 0;
            }
        }
        int minOccur = Integer.MAX_VALUE;
        for (char c: record.keySet()) {
            int time = record.get(c);
            if (c == 'l' || c == 'o') {
                if (time / 2 < minOccur) {
                    minOccur = time / 2;
                }
            } else {
                if (time < minOccur) {
                    minOccur = time;
                }
            }
        }

        return minOccur;
    }
}