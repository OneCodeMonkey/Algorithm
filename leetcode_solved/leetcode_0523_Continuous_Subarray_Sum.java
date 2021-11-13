// AC: Runtime: 14 ms, faster than 96.51% of Java online submissions for Continuous Subarray Sum.
// Memory Usage: 55.2 MB, less than 78.62% of Java online submissions for Continuous Subarray Sum.
// prefixSum
// T:O(n), S:O(k)
// 
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int size = nums.length, sum = 0;
        HashMap<Integer, Integer> modKRecord = new HashMap();
        modKRecord.put(0, -1);
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            int mod = sum % k;
            if (modKRecord.containsKey(mod)) {
                if (i - modKRecord.get(mod) > 1) {
                    return true;
                }
            } else {
                modKRecord.put(mod, i);
            }
        }

        return false;
    }
}
