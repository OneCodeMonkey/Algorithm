// AC: Runtime 2 ms Beats 100% 
// Memory 43.1 MB Beats 33.33%
// Hashset.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int len = nums.length;
        for (int num : nums) {
            if (num > len - 1) {
                return false;
            }
            if (record.containsKey(num)) {
                if (num != len - 1) {
                    return false;
                }
                if (record.get(num) > 1) {
                    return false;
                }
            }
            record.merge(num, 1, Integer::sum);
        }

        return true;
    }
}
