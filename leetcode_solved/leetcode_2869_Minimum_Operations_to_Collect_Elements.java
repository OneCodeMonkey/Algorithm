// AC: Runtime 1 ms Beats 100%
// Memory 41 MB Beats 100%
// HashSet.
// T:O(n), S:O(k)
// 
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> record = new HashSet<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) <= k) {
                record.add(nums.get(i));
                if (record.size() == k) {
                    return nums.size() - i;
                }
            }
        }

        return nums.size();
    }
}
