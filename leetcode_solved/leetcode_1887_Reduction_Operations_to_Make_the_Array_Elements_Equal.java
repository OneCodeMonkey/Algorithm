// AC: Runtime: 236 ms, faster than 30.07% of Java online submissions for Reduction Operations to Make the Array Elements Equal.
// Memory Usage: 48.8 MB, less than 80.16% of Java online submissions for Reduction Operations to Make the Array Elements Equal.
// using treemap.
// T:O(n), S:O(1)
// 
class Solution {
    public int reductionOperations(int[] nums) {
        int ret = 0;
        TreeMap<Integer, Integer> record = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i: nums) {
            record.merge(i, 1, Integer::sum);
        }

        int lastIntTime = -1;
        for (int i: record.keySet()) {
            if (lastIntTime == -1) {
                lastIntTime = record.get(i);
            } else {
                ret += lastIntTime;
                lastIntTime = lastIntTime + record.get(i);
            }
        }

        return ret;
    }
}