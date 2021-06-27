// AC: Runtime: 11 ms, faster than 5.66% of Java online submissions for Flood Fill.
// Memory Usage: 40 MB, less than 42.75% of Java online submissions for Flood Fill.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length, col = image[0].length, initialValue = image[sr][sc];
        List<String> toComplete = new LinkedList<>();
        HashSet<String> checked = new HashSet<>();
        toComplete.add(sr + "#" + sc);
        while (!toComplete.isEmpty()) {
            List<String> newAdd = new LinkedList<>();
            for (String str: toComplete) {
                if (!checked.contains(str)) {
                    checked.add(str);
                } else {
                    continue;
                }
                String[] split = str.split("#");
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                if (image[x][y] == initialValue) {
                    image[x][y] = newColor;
                }

                // add adjencent and equal valued point
                if (x - 1 >= 0 && image[x - 1][y] == initialValue) {
                    newAdd.add((x - 1) + "#" + y);
                }
                if (x + 1 < row && image[x + 1][y] == initialValue) {
                    newAdd.add((x + 1) + "#" + y);
                }
                if (y - 1 >= 0 && image[x][y - 1] == initialValue) {
                    newAdd.add(x + "#" + (y - 1));
                }
                if (y + 1 < col && image[x][y + 1] == initialValue) {
                    newAdd.add(x + "#" + (y + 1));
                }
            }
            toComplete = newAdd;
        }

        return image;
    }
}