// AC: Runtime: 18 ms, faster than 62.24% of Java online submissions for Combinations.
// Memory Usage: 53.6 MB, less than 5.33% of Java online submissions for Combinations.
// backtracking.
// T:O(C(n, k)), S:O(C(n, k) * k)
//
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();

        backtracking(n, k, temp, ret, 1);

        return ret;
    }

    public void backtracking(int n, int k, List<Integer> path, List<List<Integer>> out, int startIndex) {
        List<Integer> pathCopy = new LinkedList<>(path);
        if (path.size() == k) {
            out.add(pathCopy);
            return;
        }

        for (int i = startIndex; i <= n + pathCopy.size() - k + 1; i++) {
            pathCopy.add(i);
            backtracking(n, k, pathCopy, out, i + 1);
            pathCopy.remove(pathCopy.size() - 1);
        }
    }
}