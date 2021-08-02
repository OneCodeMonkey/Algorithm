// AC: Runtime: 1 ms, faster than 28.80% of Java online submissions for Combination Sum III.
// Memory Usage: 36.9 MB, less than 30.36% of Java online submissions for Combination Sum III.
// backtracking
// T:O(C(n, k)), S:O(k)
// 
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new LinkedList<>();
        int sum = 0;
        backtracking(sum, n, k, new LinkedList<>(), ret, 1);
        return ret;
    }

    private void backtracking(int curSum, int n, int k, List<Integer> path, List<List<Integer>> out, int startIndex) {
        if (curSum > n) {
            return;
        }
        List<Integer> pathCopy = new LinkedList<>(path);
        if (path.size() == k) {
            if (curSum == n) {
                out.add(pathCopy);
            }
            return;
        }
        for (int i = startIndex; i <= 9 + pathCopy.size() - k + 1; i++) {
            curSum += i;
            pathCopy.add(i);
            backtracking(curSum, n, k, pathCopy, out, i + 1);
            curSum -= i;
            pathCopy.remove(pathCopy.size() - 1);
        }
    }
}
