// AC: Runtime: 83 ms, faster than 9.78% of Java online submissions for Permutations II.
// Memory Usage: 40.1 MB, less than 24.22% of Java online submissions for Permutations II.
// backtracking
// T:O(2^n), S:O(n * 2^n)
// 
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> record = new HashSet<>();
        int[] used = new int[nums.length];
        backtracking(nums, used, new LinkedList<>(), record);

        return new LinkedList<>(record);
    }

    private void backtracking(int[] nums, int[] used, List<Integer> path, HashSet<List<Integer>> out) {
        List<Integer> pathCopy = new LinkedList<>(path);
        if (pathCopy.size() >= nums.length) {
            out.add(pathCopy);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            pathCopy.add(nums[i]);
            used[i] = 1;
            backtracking(nums, used, pathCopy, out);
            pathCopy.remove(pathCopy.size() - 1);
            used[i] = 0;
        }
    }
}