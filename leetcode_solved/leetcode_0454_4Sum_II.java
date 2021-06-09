// AC: Runtime: 105 ms, faster than 49.00% of Java online submissions for 4Sum II.
// Memory Usage: 39.3 MB, less than 37.05% of Java online submissions for 4Sum II.
// using hashmap
// T:O(n^2), S:O(n^2)
//
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int size = nums1.length;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                record.merge(nums1[i] + nums2[j], 1, Integer::sum);
            }
        }

        int ret = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int temp = -nums3[i] - nums4[j];
                if (record.containsKey(temp)) {
                    ret += record.get(temp);
                }
            }
        }
        
        return ret;
    }
}