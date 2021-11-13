// AC: Runtime: 19 ms, faster than 88.59% of Java online submissions for Contiguous Array.
// Memory Usage: 48.6 MB, less than 88.89% of Java online submissions for Contiguous Array.
// prefix sum & hashmap
// T:O(n), S:O(n)
//
class Solution {
    public int findMaxLength(int[] nums) {
        int size = nums.length, sum = 0, ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        record.put(0, -1);
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (record.containsKey(sum)) {
                ret = Math.max(ret, i - record.get(sum));
            } else {
                record.put(sum, i);
            }
        }

        return ret;
    }
}
