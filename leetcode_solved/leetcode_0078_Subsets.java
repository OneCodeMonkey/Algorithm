// AC: Runtime: 1 ms, faster than 58.25% of Java online submissions for Subsets.
// Memory Usage: 39.4 MB, less than 45.07% of Java online submissions for Subsets.
// backtracking
// T:O(2^n), S:O(n * 2^n)
// 
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new LinkedList<>();
        backtracking(nums, new LinkedList<>(), ret, 0);

        return ret;
    }

    private void backtracking(int[] nums, List<Integer> path, List<List<Integer>> out, int startIndex) {
        List<Integer> pathCopy = new LinkedList<>(path);
        out.add(pathCopy);
        if (startIndex >= nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            pathCopy.add(nums[i]);
            backtracking(nums, pathCopy, out, i + 1);
            pathCopy.remove(pathCopy.size() - 1);
        }
    }
}