// Runtime 1 ms Beats 100% 
// Memory 39.8 MB Beats 100%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Float> record = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            record.add(((float) nums[i] + nums[nums.length - 1 - i]) / 2);
        }

        return record.size();
    }
}
