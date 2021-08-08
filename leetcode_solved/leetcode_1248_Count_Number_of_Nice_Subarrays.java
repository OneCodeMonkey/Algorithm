// AC:: Runtime: 36 ms, faster than 26.88% of Java online submissions for Count Number of Nice Subarrays.
// Memory Usage: 47 MB, less than 95.84% of Java online submissions for Count Number of Nice Subarrays.
// same thought as prefixSum, see @ https://leetcode.com/problems/subarray-sum-equals-k/discuss/1380435/O(n2)-and-O(n)-or-Two-java-solutions-with-annotation
// T:O(n), S:O(n)
//
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ret = 0, size = nums.length;
        int oddCountSum = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        for (int num : nums) {
            if (num % 2 == 1) {
                oddCountSum++;
            }

            if (record.get(oddCountSum - k) != null) {
                ret += record.get(oddCountSum - k);
            }

            record.merge(oddCountSum, 1, Integer::sum);
        }

        return ret;
    }
}