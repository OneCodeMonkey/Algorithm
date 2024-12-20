// Runtime 0 ms Beats 100.00%
// Memory 44.94 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int maxVal = 0, maxValIndex = Integer.MAX_VALUE, prevTime = 0;
        for (int[] event : events) {
            int index = event[0], time = event[1];
            if (prevTime == -1 || time - prevTime == maxVal) {
                maxValIndex = Math.min(maxValIndex, index);
                maxVal = time - prevTime;
            } else if (time - prevTime > maxVal) {
                maxValIndex = index;
                maxVal = time - prevTime;
            }
            prevTime = time;
        }

        return maxValIndex;
    }
}
