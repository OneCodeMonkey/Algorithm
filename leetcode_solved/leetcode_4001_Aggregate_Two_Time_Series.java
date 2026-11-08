// Runtime 127 ms Beats 9.03% 
// Memory 272.30 MB Beats 5.10%
// Traval from the largest timestamp.
// T:O(n), S:O(n)
// 
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int cur1 = 0, cur2 = 0;
        HashSet<Integer> keys = new HashSet<>();
        HashMap<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (int[] row : series1) {
            map1.put(row[0], row[1]);
            keys.add(row[0]);
        }
        for (int[] row : series2) {
            map2.put(row[0], row[1]);
            keys.add(row[0]);
        }
        List<Integer> keyList = new ArrayList<>(keys);
        Collections.sort(keyList);
        List<List<Integer>> ret = new ArrayList<>(), ret2 = new ArrayList<>();
        for (int i = keyList.size() - 1; i >= 0; i--) {
            int key = keyList.get(i), val = 0;
            if (map1.containsKey(key)) {
                val += map1.get(key);
                cur1 = map1.get(key);
            } else {
                val += cur1;
            }

            if (map2.containsKey(key)) {
                val += map2.get(key);
                cur2 = map2.get(key);
            } else {
                val += cur2;
            }

            ret.add(Arrays.asList(key, val));
        }
        for (int i = ret.size() - 1; i >= 0; i--) {
            ret2.add(ret.get(i));
        }

        return ret2;
    }
}
