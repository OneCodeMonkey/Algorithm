// AC: Runtime: 5 ms, faster than 97.97% of Java online submissions for Sort Characters By Frequency.
// Memory Usage: 39.8 MB, less than 82.44% of Java online submissions for Sort Characters By Frequency.
// Using hashmap, or just array to sort by frequency.
// T:O(1), S:O(1)
//
class Solution {
    public String frequencySort(String s) {
        int[][] record = new int[255][2];
        for (int i = 0; i < 255; i++) {
            record[i][0] = i;
        }
        for (char c: s.toCharArray()) {
            record[(int)c][1]++;
        }
        Arrays.sort(record, (a, b) -> (b[1] - a[1]));
        StringBuilder ret = new StringBuilder();
        for (int[] row: record) {
            char c = (char) row[0];
            for (int i = 0; i < row[1]; i++) {
                ret.append(c);
            }
        }

        return ret.toString();
    }
}