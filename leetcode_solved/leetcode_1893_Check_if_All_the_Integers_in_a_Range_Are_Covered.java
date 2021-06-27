// AC: Runtime: 2 ms, faster than 40.48% of Java online submissions for Check if All the Integers in a Range Are Covered.
// Memory Usage: 38.6 MB, less than 50.52% of Java online submissions for Check if All the Integers in a Range Are Covered.
// .
// T:O(n), S:O(max(range[i][j]) - min(range[i][j]))
// 
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> record = new HashSet<>();
        for (int[] item: ranges) {
            for (int i = item[0]; i <= item[1]; i++) {
                record.add(i);
            }
        }

        for (int i = left; i <= right; i++) {
            if (!record.contains(i)) {
                return false;
            }
        }
        
        return true;
    }
}