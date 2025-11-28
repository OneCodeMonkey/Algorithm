// Runtime 6 ms Beats 100.00% 
// Memory 46.66 MB Beats 89.00%
// .
// T:O(n + logn), S:O(n)
// 
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    ret.add(j);
                }
            }
        }

        return ret;
    }
}
