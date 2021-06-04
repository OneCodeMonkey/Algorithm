// AC: Runtime: 46 ms, faster than 5.00% of Java online submissions for Number of Islands.
// Memory Usage: 52.3 MB, less than 5.30% of Java online submissions for Number of Islands.
// 从每一个未归类的独立 1 出发，遍历找到所有与之相邻的 1，并标记“已找过”，直到无法找到新的相邻 1 加入，此时一个 island 就完成
// T:O(m * n), S:O(m * n)
// .
class Solution {
    public int numIslands(char[][] grid) {
        int ret = 0, row = grid.length, col = grid[0].length;
        int[][] checked = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (checked[i][j] == 1) {
                    continue;
                }
                if (grid[i][j] == '0') {
                    checked[i][j] = 1;
                    continue;
                }
                List<String> toCheck = new LinkedList<>();
                HashSet<String> curIsland = new HashSet<>();
                curIsland.add(i + "#" + j);
                findAdjacent(grid, i, j, curIsland, toCheck, checked);
                while (toCheck.size() > 0) {
                    List<String> toCheckCopy = new LinkedList<>(toCheck);
                    for (String str: toCheckCopy) {
                        String[] arr = str.split("#");
                        int tempI = Integer.parseInt(arr[0]);
                        int tempJ = Integer.parseInt(arr[1]);
                        findAdjacent(grid, tempI, tempJ, curIsland, toCheck, checked);
                        toCheck.remove(str);
                    }
                }
                ret++;
            }
        }

        return ret;
    }

    private void findAdjacent(char[][] grid, int i, int j, HashSet<String> out, List<String> toCheck, int[][] checked) {
        if (i - 1 >= 0 && checked[i - 1][j] == 0) {
            if (grid[i - 1][j] == '1') {
                String temp = (i - 1) + "#" + j;
                if (!out.contains(temp)) {
                    out.add(temp);
                    toCheck.add(temp);
                }
            }
            checked[i - 1][j] = 1;
        }
        if (i + 1 < grid.length && checked[i + 1][j] == 0) {
            if (grid[i + 1][j] == '1') {
                String temp = (i + 1) + "#" + j;
                if (!out.contains(temp)) {
                    out.add(temp);
                    toCheck.add(temp);
                }
            }
            checked[i + 1][j] = 1;
        }
        if (j - 1 >= 0 && checked[i][j - 1] == 0) {
            if (grid[i][j - 1] == '1') {
                String temp = i + "#" + (j - 1);
                if (!out.contains(temp)) {
                    out.add(temp);
                    toCheck.add(temp);
                }
            }
            checked[i][j - 1] = 1;
        }
        if (j + 1 < grid[0].length && checked[i][j + 1] == 0) {
            if (grid[i][j + 1] == '1') {
                String temp = i + "#" + (j + 1);
                if (!out.contains(temp)) {
                    out.add(temp);
                    toCheck.add(temp);
                }
            }
            checked[i][j + 1] = 1;
        }
    }
}