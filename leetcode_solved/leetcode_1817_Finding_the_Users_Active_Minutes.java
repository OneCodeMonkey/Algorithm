// AC: Runtime: 23 ms, faster than 31.34% of Java online submissions for Finding the Users Active Minutes.
// Memory Usage: 49.6 MB, less than 65.87% of Java online submissions for Finding the Users Active Minutes.
// using hashmap and treemap
// T:O(n), S:O(n)
// 
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> record = new HashMap<>();
        for (int[] row: logs) {
            if (record.get(row[0]) != null) {
                record.get(row[0]).add(row[1]);
            } else {
                HashSet<Integer> temp = new HashSet<>();
                temp.add(row[1]);
                record.put(row[0], temp);
            }
        }
        TreeMap<Integer, Integer> record2 = new TreeMap<>();
        for (int i: record.keySet()) {
            record2.merge(record.get(i).size(), 1, Integer::sum);
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            if (record2.get(i + 1) != null) {
                ret[i] = record2.get(i + 1);
            }
        }

        return ret;
    }
}