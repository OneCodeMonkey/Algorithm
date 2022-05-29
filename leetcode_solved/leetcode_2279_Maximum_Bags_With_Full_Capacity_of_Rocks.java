// AC: Runtime: 10 ms, faster than 99.97% of Java online submissions for Maximum Bags With Full Capacity of Rocks.
// Memory Usage: 53.4 MB, less than 93.06% of Java online submissions for Maximum Bags With Full Capacity of Rocks.
// greedy, sort
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        long remainSum = 0;
        int pos = 0, size = capacity.length;
        int[] remain = new int[size];
        for (int i = 0; i < size; i++) {
            int remainI = capacity[i] - rocks[i];
            remain[pos++] = remainI;
            remainSum += remainI;
        }
        if (remainSum <= additionalRocks) {
            return size;
        } else {
            Arrays.sort(remain);
            int ret = 0;
            for (int i : remain) {
                if (i == 0) {
                    ret++;
                } else if (additionalRocks >= i) {
                    ret++;
                    additionalRocks -= i;
                }
            }
            return ret;
        }
    }
}