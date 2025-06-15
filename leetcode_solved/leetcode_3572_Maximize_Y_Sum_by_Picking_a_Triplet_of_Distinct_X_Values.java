// Runtime 105 ms Beats 100.00% 
// Memory 61.61 MB Beats 100.00%
// Sort & greedy
// T:O(n), S:O(nlogn)
// 
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int len = x.length;
        for (int i = 0; i < len; i++) {
            if (record.containsKey(x[i]) && record.get(x[i]) >= y[i]) {
                continue;
            }
            record.put(x[i], y[i]);
        }
        if (record.size() < 3) {
            return -1;
        }
        List<Integer> vals = new ArrayList<>();
        for (int key : record.keySet()) {
            vals.add(record.get(key));
        }
        vals.sort(Collections.reverseOrder());

        return vals.get(0) + vals.get(1) + vals.get(2);
    }
}
