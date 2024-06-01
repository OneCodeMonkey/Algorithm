// Runtime 36 ms Beats 100.00% of users with Java
// Memory 82.36 MB Beats 100.00% of users with Java
// Two hashmap.
// T:O(k), S:O(n)
// 
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> labelToColor = new HashMap<>(), colorToCount = new HashMap<>();
        int len = queries.length, pos = 0;
        int[] ret = new int[len];
        for (int[] query : queries) {
            int label = query[0], color = query[1];
            if (!labelToColor.containsKey(label)) {
                labelToColor.put(label, color);
                colorToCount.merge(color, 1, Integer::sum);
            } else {
                int prevColor = labelToColor.get(label);
                if (colorToCount.get(prevColor) == 1) {
                    colorToCount.remove(prevColor);
                } else {
                    colorToCount.merge(prevColor, -1, Integer::sum);
                }
                labelToColor.put(label, color);
                colorToCount.merge(color, 1, Integer::sum);
            }
            ret[pos++] = colorToCount.size();
        }

        return ret;
    }
}
