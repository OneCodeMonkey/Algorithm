// Runtime 8 ms Beats 18.32% 
// Memory 47.17 MB Beats 27.10%
// Map.
// T:O(n)~O(n^2), S:O(n)
// 
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }
        for (int i : freq.keySet()) {
            for (int j : freq.keySet()) {
                if (j > i && freq.get(i) != freq.get(j)) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}