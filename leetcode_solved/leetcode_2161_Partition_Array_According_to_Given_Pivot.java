// AC: Runtime: 14 ms, faster than 80.00% of Java online submissions for Partition Array According to Given Pivot.
// Memory Usage: 58.9 MB, less than 80.00% of Java online submissions for Partition Array According to Given Pivot.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int size = nums.length, pivotCount = 0, pos = 0;
        List<Integer> smaller = new LinkedList<>(), greater = new LinkedList<>();
        for (int i:nums) {
            if (i < pivot) {
                smaller.add(i);
            } else if (i == pivot) {
                pivotCount++;
            } else {
                greater.add(i);
            }
        }
        int[] ret = new int[size];
        for (int i:smaller) {
            ret[pos++] = i;
        }
        for (int i = 0; i < pivotCount; i++) {
            ret[pos++] = pivot;
        }
        for (int i:greater) {
            ret[pos++] = i;
        }
        return ret;
    }
}