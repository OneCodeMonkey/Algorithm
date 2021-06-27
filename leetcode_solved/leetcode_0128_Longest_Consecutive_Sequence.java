// AC: Runtime: 275 ms, faster than 20.28% of Java online submissions for Longest Consecutive Sequence.
// Memory Usage: 54.4 MB, less than 42.86% of Java online submissions for Longest Consecutive Sequence.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 1;
        HashSet<Integer> record = new HashSet<>();
        for (int i: nums) {
            record.add(i);
        }

        for (int i: nums) {
            if (!record.contains(i - 1)) {
                int j = i + 1;
                while (record.contains(j)) {
                    j++;
                    max = Math.max(max, j - i);
                }
            }
        }

        return max;
    }
}