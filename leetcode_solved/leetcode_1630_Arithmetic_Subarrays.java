// AC: Runtime: 30 ms, faster than 47.91% of Java online submissions for Arithmetic Subarrays.
// Memory Usage: 52.3 MB, less than 9.43% of Java online submissions for Arithmetic Subarrays.
// basic check the array arithmetic see @https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
// T:O(m * n), S:O(max(m, n)),  m = l.length, n = nums.length
// 
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        HashMap<String, Boolean> cache = new HashMap<>();
        int n = nums.length, m = l.length;
        List<Boolean> ret = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            int start = l[i], end = r[i];
            if (end - start == 1) {
                ret.add(true);
                continue;
            }
            String temp = start + "#" + end;
            if (cache.containsKey(temp)) {
                ret.add(cache.get(temp));
                continue;
            }
            int tempMax = Integer.MIN_VALUE, tempMin = Integer.MAX_VALUE;
            for (int j = start; j <= end; j++) {
                tempMax = Math.max(tempMax, nums[j]);
                tempMin = Math.min(tempMin, nums[j]);
            }
            int check = (tempMax - tempMin) % (end - start);
            if (check != 0) {
                ret.add(false);
                cache.put(temp, false);
                continue;
            }
            int diffAvg = (tempMax - tempMin) / (end - start);
            if (diffAvg == 0) {
                ret.add(true);
                cache.put(temp, true);
                continue;
            }

            HashSet<Integer> diffSet = new HashSet<>();
            boolean flag = true;
            for (int j = start; j <= end; j++) {
                int tempDiff = nums[j] - tempMin;
                diffSet.add(tempDiff);
                if (tempDiff % diffAvg != 0) {
                    flag = false;
                    break;
                }
            }

            boolean result = flag && diffSet.size() == (end - start + 1);
            ret.add(result);
            cache.put(temp, result);
        }

        return ret;
    }
}