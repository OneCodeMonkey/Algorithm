// AC: Runtime: 6 ms, faster than 7.31% of Java online submissions for Slowest Key.
// Memory Usage: 38.7 MB, less than 94.22% of Java online submissions for Slowest Key.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<Character, Integer> recordLetter = new HashMap<>();
        TreeMap<Integer, Character> record = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int size = releaseTimes.length;
        recordLetter.put(keysPressed.charAt(0), releaseTimes[0]);
        for (int i = 1; i < size; i++) {
            char c = keysPressed.charAt(i);
            if (recordLetter.containsKey(c)) {
                recordLetter.put(c, Math.max(recordLetter.get(c), (releaseTimes[i] - releaseTimes[i - 1])));
            } else {
                recordLetter.put(c, releaseTimes[i] - releaseTimes[i - 1]);
            }
        }

        for (char c : recordLetter.keySet()) {
            int time = recordLetter.get(c);
            if (record.containsKey(time) && c > record.get(time)) {
                record.put(time, c);
            } else {
                record.put(time, c);
            }
        }

        for (int item: record.keySet()) {
            return record.get(item);
        }

        return ' ';
    }
}