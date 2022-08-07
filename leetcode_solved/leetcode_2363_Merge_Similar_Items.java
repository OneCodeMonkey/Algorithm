// AC: Runtime: 17 ms, faster than 33.33% of Java online submissions for Merge Similar Items.
// Memory Usage: 54.9 MB, less than 33.33% of Java online submissions for Merge Similar Items.
// TreeMap
// T:O((m+n)log(m+n)), S:O(m+n)
// 
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int[] item : items1) {
            record.merge(item[0], item[1], Integer::sum);
        }
        for (int[] item : items2) {
            record.merge(item[0], item[1], Integer::sum);
        }
        List<List<Integer>> ret = new LinkedList<>();
        for (int key : record.keySet()) {
            ret.add(Arrays.asList(key, record.get(key)));
        }

        return ret;
    }
}
