// Runtime 51 ms Beats 53.61% of users with Java
// Memory 57.03 MB Beats 69.70% of users with Java
// Sort & greedy.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int item : arr) {
            record.merge(item, 1, Integer::sum);
        }
        int[][] count = new int[record.size()][2];
        int pos = 0, cur = 0, ret = 0;
        for (int val : record.keySet()) {
            count[pos++] = new int[]{val, record.get(val)};
        }
        Arrays.sort(count, Comparator.comparingInt(a -> a[1]));
        for (int[] row : count) {
            cur += row[1];
            if (cur > k) {
                ret++;
            }
        }

        return ret;
    }
}
