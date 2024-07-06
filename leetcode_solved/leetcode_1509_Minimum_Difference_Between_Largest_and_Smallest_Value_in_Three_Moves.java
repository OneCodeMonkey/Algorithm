// Runtime 15 ms Beats 96.06%
// Memory 57.08 MB Beats 54.33%
// Sort & find sliding range max.
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int minDifference(int[] nums) {
        int len = nums.length;
        if (len <= 4) {
            return 0;
        }
        long maxDiffSum = 0;
        Arrays.sort(nums);
        List<Integer> diffList = new ArrayList<>();
        for (int i = 3; i > 0; i--) {
            diffList.add(nums[i] - nums[i - 1]);
        }
        for (int i = len - 1; i > len - 4; i--) {
            diffList.add(nums[i] - nums[i - 1]);
        }
        maxDiffSum = diffList.get(0) + diffList.get(1) + diffList.get(2);
        for (int i = 1; i + 2 < diffList.size(); i++) {
            maxDiffSum = Math.max(maxDiffSum, diffList.get(i) + diffList.get(i + 1) + diffList.get(i + 2));
        }

        return (int) (nums[len - 1] - nums[0] - maxDiffSum);
    }
}
