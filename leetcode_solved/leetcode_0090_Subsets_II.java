// AC: Runtime: 6 ms, faster than 11.49% of Java online submissions for Subsets II.
// Memory Usage: 39.3 MB, less than 46.18% of Java online submissions for Subsets II.
// backtracking
// T:O(2^n), S:O(n * 2^n)
//
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> record = new HashSet<>();
        record.add(new LinkedList<>());
//        int[] used = new int[nums.length];
        backtracking(nums, new LinkedList<>(), record, 0);

        return new LinkedList<>(record);
    }

    private void backtracking(int[] nums, List<Integer> path, HashSet<List<Integer>> out, int startIndex) {
        List<Integer> pathCopy = new LinkedList<>(path);
        // combination does not varify by order, so first sort to remove dup.
        Collections.sort(pathCopy);
        out.add(pathCopy);

        for (int i = startIndex; i < nums.length; i++) {
            pathCopy.add(nums[i]);
            backtracking(nums, pathCopy, out, i + 1);
            pathCopy.remove(pathCopy.size() - 1);
        }
    }
}