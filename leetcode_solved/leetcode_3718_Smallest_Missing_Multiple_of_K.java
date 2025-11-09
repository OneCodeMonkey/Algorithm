// Runtime 2 ms Beats 78.81% 
// Memory 43.01 MB Beats 93.35%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> record = new HashSet<>();
        for (int i : nums) {
            if (i % k == 0) {
                record.add(i);
            }
        }
        for (int i = 1; i < nums.length + 1; i++) {
            if (!record.contains(i * k)) {
                return i * k;
            }
        }

        return (nums.length + 1) * k;
    }
}
