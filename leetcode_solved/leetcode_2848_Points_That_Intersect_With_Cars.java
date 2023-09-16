// AC: Runtime 2 ms Beats 100%
// Memory 43 MB Beats 50%
// Brute-force.
// T:O(sum(ai - bi)), S:O(K)
// 
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int ret = 0;
        int[] arr = new int[101];
        for (List<Integer> range : nums) {
            for (int i = range.get(0); i <= range.get(1); i++) {
                arr[i] = 1;
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (arr[i] == 1) {
                ret++;
            }
        }

        return ret;
    }
}
