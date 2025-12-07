// Runtime 201 ms Beats 5.06% 
// Memory 271.95 MB Beats 80.02%
// Map.
// T:O(n), S:O(n)
// 
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        HashMap<Integer, List<Integer>> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numCount.merge(nums[i], 1, Integer::sum);
            numIndex.computeIfAbsent(nums[i], k -> new ArrayList<>());
            numIndex.get(nums[i]).add(i);
        }
        int ret = -1;
        for (int i : numCount.keySet()) {
            if (numCount.get(i) >= 3) {
                int minDiff = Integer.MAX_VALUE;
                for (int j = 0; j < numIndex.get(i).size() - 2; j++) {
                    minDiff = Math.min(minDiff, numIndex.get(i).get(j + 2) - numIndex.get(i).get(j));
                    if (minDiff == 2) {
                        break;
                    }
                }
                ret = ret == -1 ? 2 * minDiff : Math.min(ret, 2 * minDiff);
            }
        }

        return ret;
    }
}
