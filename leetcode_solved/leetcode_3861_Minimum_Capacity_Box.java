// Runtime 0 ms Beats 100.00% 
// Memory 44.66 MB Beats 57.97%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int curMin = Integer.MAX_VALUE, curMinIndex = -1;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (capacity[i] < curMin) {
                    curMin = capacity[i];
                    curMinIndex = i;
                }
            }
        }

        return curMinIndex;
    }
}
