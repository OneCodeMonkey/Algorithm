// TLE:
// todo-qualify
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int size = heights.length;
        int[] ret = new int[size];

        int[] leftMax = new int[size];
        leftMax[size - 1] = heights[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            leftMax[i] = Math.max(heights[i], leftMax[i + 1]);
        }

        for (int i = size - 1; i >= 0; i--) {
            int betweenMax = 0, canSeeCount = 0;
            for (int j = i + 1; j < size; j++) {
                if (heights[i] > betweenMax && heights[j] > betweenMax) {
                    canSeeCount++;
                    betweenMax = Math.max(betweenMax, heights[j]);
                    if (heights[j] >= heights[i] || heights[j] >= leftMax[j] || betweenMax >= leftMax[j]) {
                        break;
                    }
                }
            }
            ret[i] = canSeeCount;
        }

        return ret;
    }
}