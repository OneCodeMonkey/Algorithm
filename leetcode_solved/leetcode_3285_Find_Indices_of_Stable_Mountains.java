// Runtime 1 ms Beats 100.00%
// Memory 44.89 MB Beats 100.00%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                ret.add(i);
            }
        }

        return ret;
    }
}
