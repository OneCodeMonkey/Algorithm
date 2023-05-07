/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */
// AC: Runtime 2 ms Beats 82.97% 
// Memory 40.5 MB Beats 35.51%
// Understand the problem requirement.
// T:O(x + y), S:O(x + y)
// 
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ret = new LinkedList<>();
        int x = 1, y = 1000;
        while (x <= 1000 && y >= 1) {
            int v = customfunction.f(x, y);
            if (v > z) {
                y--;
            } else if (v < z) {
                x++;
            } else {
                ret.add(Arrays.asList(x, y));
                x++;
                y--;
            }
        }

        return ret;
    }
}