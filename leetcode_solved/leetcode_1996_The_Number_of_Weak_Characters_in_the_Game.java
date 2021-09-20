// AC: Runtime: 86 ms, faster than 86.87% of Java online submissions for The Number of Weak Characters in the Game.
// Memory Usage: 86 MB, less than 82.35% of Java online submissions for The Number of Weak Characters in the Game.
// sorting by the first property, then just check the second.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int max = Integer.MIN_VALUE, ret = 0;
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? (a[1] - b[1]) : (b[0] - a[0]));
        for (int[] property: properties) {
            if (property[1] < max) {
                ret++;
            } else {
                max = property[1];
            }
        }

        return ret;
    }
}