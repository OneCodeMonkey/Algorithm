// AC: Runtime 7 ms Beats 7.67% 
// Memory 42.8 MB Beats 17.44%
// TreeMap & check by order.
// T:O(n^2), S:O(n^2)
// 
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        TreeMap<Integer, List<Integer>> movementList = new TreeMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                movementList.put(grid[i][j], Arrays.asList(i, j));
            }
        }
        int prevX = 0, prevY = 0;
        for (int i : movementList.keySet()) {
            int curX = movementList.get(i).get(0), curY = movementList.get(i).get(1);
            if (i == 0) {
                if (curX != 0 || curY != 0) {
                    return false;
                }
                continue;
            }
            if (!checkMovement(prevX, prevY, curX, curY)) {
                return false;
            }
            prevX = curX;
            prevY = curY;
        }

        return true;
    }

    private boolean checkMovement(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2) ||
                (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1);
    }
}
