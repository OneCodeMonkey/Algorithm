// AC: Runtime: 26 ms, faster than 11.75% of Java online submissions for Subarray Sums Divisible by K.
// Memory Usage: 43.9 MB, less than 24.01% of Java online submissions for Subarray Sums Divisible by K.
// using prefix sum trick.
// T:O(n), S:O(k)
//
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int size = nums.length, tempSum = 0, ret = 0;
        // record the number after mod-k of prefix sums.
        HashMap<Integer, Integer> record = new HashMap<>();
        // empty array can contribute a zero.
        record.put(0, 1);

        for (int i = 0; i < size; i++) {
            tempSum += nums[i];
            int modRemain = tempSum % k;
            if (record.containsKey(modRemain)) {
                ret += record.get(modRemain);
            }
            if (record.containsKey(modRemain - k)) {
                ret += record.get(modRemain - k);
            }
            if (record.containsKey(modRemain + k)) {
                ret += record.get(modRemain + k);
            }
            record.merge(modRemain, 1, Integer::sum);
        }

        return ret;
    }
}