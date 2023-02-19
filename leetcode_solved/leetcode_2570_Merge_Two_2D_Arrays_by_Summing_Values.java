// AC: Runtime 4 ms Beats 37.50% 
// Memory 42.9 MB Beats 25%
// TreeMap.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int[] row : nums1) {
            record.merge(row[0], row[1], Integer::sum);
        }
        for (int[] row : nums2) {
            record.merge(row[0], row[1], Integer::sum);
        }
        int[][] ret = new int[record.size()][2];
        int pos = 0;
        for (int i : record.keySet()) {
            ret[pos++] = new int[]{i, record.get(i)};
        }

        return ret;
    }
}