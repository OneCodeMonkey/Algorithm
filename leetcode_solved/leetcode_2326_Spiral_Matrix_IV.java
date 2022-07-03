// AC: Runtime: 13 ms, faster than 66.67% of Java online submissions for Spiral Matrix IV.
// Memory Usage: 294.1 MB, less than 16.67% of Java online submissions for Spiral Matrix IV.
// simulation.
// T:O(m * n), S:O(m * n)
// 
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ret = new int[m][n];
        // right, down, left, up
        int[] directions = new int[]{0, 1, 2, 3};
        int curDirection = 0, curX = 0, curY = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret[i][j] = -1;
            }
        }
        while (head != null) {
            int val = head.val;
            switch (curDirection) {
                case 0:
                    if (curY + 1 >= n || ret[curX][curY + 1] != -1) {
                        curDirection = (curDirection + 1) % 4;
                    }
                    break;
                case 1:
                    if (curX + 1 >= m || ret[curX + 1][curY] != -1) {
                        curDirection = (curDirection + 1) % 4;
                    }
                    break;
                case 2:
                    if (curY - 1 < 0 || ret[curX][curY - 1] != -1) {
                        curDirection = (curDirection + 1) % 4;
                    }
                    break;
                case 3:
                    if (curX - 1 < 0 || ret[curX - 1][curY] != -1) {
                        curDirection = (curDirection + 1) % 4;
                    }
                    break;
                default:
                    break;
            }

            switch (curDirection) {
                case 0:
                    ret[curX][curY++] = val;
                    break;
                case 1:
                    ret[curX++][curY] = val;
                    break;
                case 2:
                    ret[curX][curY--] = val;
                    break;
                case 3:
                    ret[curX--][curY] = val;
                    break;
                default:
                    break;
            }

            head = head.next;
        }

        return ret;
    }
}