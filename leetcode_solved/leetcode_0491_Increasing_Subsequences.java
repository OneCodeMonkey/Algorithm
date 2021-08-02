// AC: Runtime: 23 ms, faster than 18.62% of Java online submissions for Increasing Subsequences.
// Memory Usage: 53.9 MB, less than 20.74% of Java online submissions for Increasing Subsequences.
// backtracking
// T:O(2^n), S:O(n * 2^n)
// 
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> record = new HashSet<>();

        backtracking(nums, new LinkedList<>(), record, 0);

        return new LinkedList<>(record);
    }

    private void backtracking(int[] nums, List<Integer> path, HashSet<List<Integer>>out, int startIndex) {
        List<Integer> pathCopy = new LinkedList<>(path);
        if (pathCopy.size() >= 2) {
            out.add(pathCopy);
        }
        if (startIndex >= nums.length) {
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (pathCopy.isEmpty() || nums[i] >= pathCopy.get(pathCopy.size() - 1)) {
                pathCopy.add(nums[i]);
                backtracking(nums, pathCopy, out, i + 1);
                pathCopy.remove(pathCopy.size() - 1);
            }
        }
    }
}