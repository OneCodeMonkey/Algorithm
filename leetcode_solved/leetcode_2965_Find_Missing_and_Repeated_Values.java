// AC: Runtime 4 ms Beats 100.00% of users with Java
// Memory 44.24 MB Beats 100.00% of users with Java
// .
// T:O(n^2), S:O(n^2)
// 
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row = grid.length, repeated = 0;
        long sum = 0, target = (1 + (long) row * row) * row * row / 2;
        HashSet<Integer> record = new HashSet<>();
        for (int[] rowItem : grid) {
            for (int i : rowItem) {
                sum += i;
                if (record.contains(i)) {
                    repeated = i;
                } else {
                    record.add(i);
                }
            }
        }

        return new int[]{repeated, (int) (target - sum + repeated)};
    }
}
