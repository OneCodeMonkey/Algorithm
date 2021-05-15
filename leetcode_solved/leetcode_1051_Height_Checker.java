// Runtime: 1 ms, faster than 79.09% of Java online submissions for Height Checker.
// Memory Usage: 36.6 MB, less than 72.88% of Java online submissions for Height Checker.
// .
// T:O(n), S:O(n)
//
class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = new int[heights.length];
        System.arraycopy(heights, 0, copy, 0, heights.length);
        Arrays.sort(heights);
        int ret = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                ret++;
            }
        }
        return ret;
    }
}