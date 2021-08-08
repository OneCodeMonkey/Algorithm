// AC: Runtime: 58 ms, faster than 29.64% of Java online submissions for Partition Equal Subset Sum.
// Memory Usage: 39.8 MB, less than 53.10% of Java online submissions for Partition Equal Subset Sum.
// using hashset record middle sums.
// T:O(n) ~ O(n^2), S:O(n) ~ S:O(n ^ 2)
// 
class Solution {
    public boolean canPartition(int[] nums) {
        int size = nums.length, sum = 0, targetSum;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 == 0) {
            targetSum = sum / 2;
            int tempSum = 0;
            HashSet<Integer> record = new HashSet<>();
            record.add(0);

            for (int i = 0; i < size; i++) {
                HashSet<Integer> tempSet = new HashSet<>();
                for (int j : record) {
                    if (nums[i] + j == targetSum) {
                        return true;
                    }
                    if (!record.contains(nums[i] + j)) {
                        tempSet.add(nums[i] + j);
                    }
                }
                record.addAll(tempSet);
            }
        }

        return false;
    }
}