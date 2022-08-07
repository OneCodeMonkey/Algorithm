// AC: Runtime: 5 ms, faster than 66.67% of Java online submissions for Number of Arithmetic Triplets.
// Memory Usage: 40.4 MB, less than 66.67% of Java online submissions for Number of Arithmetic Triplets.
// Hashmap
// T:O(nlogn), S:O(n)
//
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        int ret = 0;
        for (int i : record.keySet()) {
            if (record.containsKey(i + diff) && record.containsKey(i + 2 * diff)) {
                ret += record.get(i) * record.get(i + diff) * record.get(i + 2 * diff);
            }
        }

        return ret;
    }
}
