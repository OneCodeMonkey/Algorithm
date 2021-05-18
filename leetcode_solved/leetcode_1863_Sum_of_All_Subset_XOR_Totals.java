// Brute-force backtracking...
// AC: Runtime: 71 ms, faster than 100.00% of Java online submissions for Sum of All Subset XOR Totals.
// Memory Usage: 67.5 MB, less than 100.00% of Java online submissions for Sum of All Subset XOR Totals.
// backtracking all subset arrays... complexity high.
// T:O(2^n), S:O(2^n)
// 
class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> record = new LinkedList<>();
        solve(nums, 0, new LinkedList<>(), record);
        long sum = 0;
        for (List<Integer> item: record) {
            int tempSum = 0;
            for (int i: item) {
                tempSum ^= i;
            }
            sum += tempSum;
        }

        return (int)sum;
    }

    // backtracking
    private void solve(int[] nums, int index, List<Integer> curPath, List<List<Integer>> out) {
        if (index >= nums.length) {
            return;
        }
        List<Integer> copy = new LinkedList<>(curPath);
        copy.add(nums[index]);
        out.add(copy);
        solve(nums, index + 1, copy, out);
        List<Integer> copy2 = new LinkedList<>(curPath);
        solve(nums, index + 1, copy2, out);
    }
}