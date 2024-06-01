// Runtime 5 ms Beats 100.00% of users with Java
// Memory 63.94 MB Beats 100.00% of users with Java
// .
// T:O(n + m), S:O(m) ~ O(n + m)
// 
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indexes.add(i);
            }
        }
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > indexes.size()) {
                ret[i] = -1;
            } else {
                ret[i] = indexes.get(queries[i] - 1);
            }
        }

        return ret;
    }
}
