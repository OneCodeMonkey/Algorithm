// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Furthest Houses With Different Colors.
// Memory Usage: 36.8 MB, less than 75.00% of Java online submissions for Two Furthest Houses With Different Colors.
// two loop.
// T:O(n), S:O(1)
// 
class Solution {
    public int maxDistance(int[] colors) {
        int ret = 0, size = colors.length, pos = 0;
        while (colors[pos] == colors[size - 1]) {
            pos++;
        }
        ret = Math.max(size - 1 - pos, ret);
        if (ret == size - 1) {
            return ret;
        }

        pos = size - 1;
        while (colors[pos] == colors[0]) {
            pos--;
        }
        ret = Math.max(pos, ret);

        return ret;
    }
}
