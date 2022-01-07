// AC: Runtime: 16 ms, faster than 58.96% of Java online submissions for Largest Values From Labels.
// Memory Usage: 41.9 MB, less than 48.88% of Java online submissions for Largest Values From Labels.
// soring values with labels, then using hashmap to meets the requirement of useLimit.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int len = values.length, ret = 0, numCount = 0;
        int[][] mapping = new int[len][2];
        for (int i = 0; i < len; i++) {
            mapping[i] = new int[]{values[i], labels[i]};
        }
        // sorting by key value desc.
        Arrays.sort(mapping, (a, b) -> {return b[0] - a[0];});

        HashMap<Integer, Integer> record = new HashMap<>();
        for (int[] row: mapping) {
            if (record.containsKey(row[1]) && record.get(row[1]) >= useLimit) {
                continue;
            }
            ret += row[0];
            numCount++;
            record.merge(row[1], 1, Integer::sum);
            if (numCount >= numWanted) {
                break;
            }
        }

        return ret;
    }
}