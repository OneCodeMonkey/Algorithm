// AC: Runtime 19 ms Beats 12.50% 
// Memory 42.2 MB Beats 87.50%
// Sort.
// T:O(logs.length), S:O(logs.length)
// 
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int len = logs.length, pos = 0;
        int[][] record = new int[len][len];
        record[pos++] = new int[]{logs[0][1], logs[0][0]};
        for (int i = 1; i < len; i++) {
            record[pos++] = new int[]{logs[i][1] - logs[i - 1][1], logs[i][0]};
        }
        Arrays.sort(record, (a, b) -> b[0] - a[0]);
        List<Integer> alternatives = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            if (record[i][0] == record[0][0]) {
                alternatives.add(record[i][1]);
            } else {
                break;
            }
        }
        Collections.sort(alternatives);

        return alternatives.get(0);
    }
}
