// AC: Runtime: 4 ms, faster than 22.22% of Java online submissions for Count Number of Pairs With Absolute Difference K.
// Memory Usage: 38.6 MB, less than 33.33% of Java online submissions for Count Number of Pairs With Absolute Difference K.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int countKDifference(int[] nums, int k) {
        int size = nums.length, ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: nums) {
            record.merge(i, 1, Integer::sum);
        }
        HashSet<Integer> visited = new HashSet<>();
        for (int i: record.keySet()) {
            if (visited.contains(i)) {
                continue;
            }
            visited.add(i);
            if (record.containsKey(i + k)) {
                ret += record.get(i) * record.get(i + k);
                visited.add(i + k);
            }
            if (record.containsKey(i - k)) {
                ret += record.get(i) * record.get(i - k);
                visited.add(i - k);
            }
        }

        return ret;
    }
}