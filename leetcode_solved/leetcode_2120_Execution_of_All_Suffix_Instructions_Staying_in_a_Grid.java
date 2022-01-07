// AC: Runtime: 54 ms, faster than 46.19% of Java online submissions for Execution of All Suffix Instructions Staying in a Grid.
// Memory Usage: 43.3 MB, less than 28.71% of Java online submissions for Execution of All Suffix Instructions Staying in a Grid.
// do as it says.
// T:O(n^2), S:O(n), n = s.length()
// 
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length(), startX = startPos[0], startY = startPos[1], curX, curY, step;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            curX = startX;
            curY = startY;
            step = 0;
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                if (c == 'R') {
                    if (curY + 1 < n) {
                        curY += 1;
                        step++;
                    } else {
                        break;
                    }
                } else if (c == 'L') {
                    if (curY - 1 >= 0) {
                        curY -= 1;
                        step++;
                    } else {
                        break;
                    }
                } else if (c == 'U') {
                    if (curX - 1 >= 0) {
                        curX -= 1;
                        step++;
                    } else {
                        break;
                    }
                } else {
                    if (curX + 1 < n) {
                        curX += 1;
                        step++;
                    } else {
                        break;
                    }
                }
            }

            ret[i] = step;
        }

        return ret;
    }
}