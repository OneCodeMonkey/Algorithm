// AC: Runtime: 84 ms, faster than 5.02% of Java online submissions for Number of Enclaves.
// Memory Usage: 49.7 MB, less than 15.17% of Java online submissions for Number of Enclaves.
// search
// T:O(m*n), S:O(m*n)
// 
class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        List<String> toSearch = new LinkedList<>();
        HashSet<String> searched = new HashSet<>();
        HashSet<String> canReach = new HashSet<>();
        String temp;
        for (int i = 0; i < col; i++) {
            temp = 0 + "#" + i;
            searched.add(temp);
            if (grid[0][i] == 1) {
                toSearch.add(temp);
                canReach.add(temp);
            }

            temp = (row - 1) + "#" + i;
            searched.add(temp);
            if (grid[row - 1][i] == 1) {
                toSearch.add(temp);
                canReach.add(temp);
            }
        }
        for (int i = 0; i < row; i++) {
            temp = i + "#" + 0;
            searched.add(temp);
            if (grid[i][0] == 1) {
                toSearch.add(temp);
                canReach.add(temp);
            }

            temp = i + "#" + (col - 1);
            searched.add(temp);
            if (grid[i][col - 1] == 1) {
                toSearch.add(temp);
                canReach.add(temp);
            }
        }
        while (!toSearch.isEmpty()) {
            List<String> copy = new LinkedList<>(toSearch);
            for (String cordi: copy) {
                String[] arr = cordi.split("#");
                int x = Integer.parseInt(arr[0]), y = Integer.parseInt(arr[1]);
                if (x - 1 >= 0) {
                    String temp2 = (x - 1) + "#" + y;
                    if (!searched.contains(temp2)) {
                        searched.add(temp2);
                        if (grid[x - 1][y] == 1) {
                            toSearch.add(temp2);
                            canReach.add(temp2);
                        }
                    }
                }
                if (x + 1 < row) {
                    String temp2 = (x + 1) + "#" + y;
                    if (!searched.contains(temp2)) {
                        searched.add(temp2);
                        if (grid[x + 1][y] == 1) {
                            toSearch.add(temp2);
                            canReach.add(temp2);
                        }
                    }
                }
                if (y - 1 >= 0) {
                    String temp2 = x + "#" + (y - 1);
                    if (!searched.contains(temp2)) {
                        searched.add(temp2);
                        if (grid[x][y - 1] == 1) {
                            toSearch.add(temp2);
                            canReach.add(temp2);
                        }
                    }
                }
                if (y + 1 < col) {
                    String temp2 = x + "#" + (y + 1);
                    if (!searched.contains(temp2)) {
                        searched.add(temp2);
                        if (grid[x][y + 1] == 1) {
                            toSearch.add(temp2);
                            canReach.add(temp2);
                        }
                    }
                }
            }
            toSearch.removeAll(copy);
        }

        int ret = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                if (grid[i][j] == 1) {
                    String temp2 = i + "#" + j;
                    if (!canReach.contains(temp2)) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}