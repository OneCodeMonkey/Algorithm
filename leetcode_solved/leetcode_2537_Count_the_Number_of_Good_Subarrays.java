// AC: Runtime 145 ms Beats 5.85% 
// Memory 60.2 MB Beats 47.81%
// Sliding window & hashmap.
// T:O(n) ~ O(n^2), S:O(n)
// 
class Solution {
    public long countGood(int[] nums, int k) {
        long ret = 0;
        HashMap<Integer, Integer> count = new HashMap<>(), moreThanOne = new HashMap<>();
        int len = nums.length, left = 0, right = 0;
        count.merge(nums[0], 1, Integer::sum);
        while (left < len) {
            long pairs = checkPairs(moreThanOne);
            if (pairs >= k) {
                ret += len - right;
                count.merge(nums[left], -1, Integer::sum);
                if (count.get(nums[left]) < 2) {
                    moreThanOne.remove(nums[left]);
                } else {
                    moreThanOne.merge(nums[left], -1, Integer::sum);
                }
                left++;
            } else {
                if (right + 1 < len) {
                    right++;
                } else {
                    break;
                }
                count.merge(nums[right], 1, Integer::sum);
                if (count.get(nums[right]) >= 2) {
                    moreThanOne.put(nums[right], count.get(nums[right]));
                }
            }
        }

        return ret;
    }

    public long checkPairs(HashMap<Integer, Integer> countTime) {
        long pairs = 0;
        for (int key : countTime.keySet()) {
            int time = countTime.get(key);
            pairs += (long) time * (time - 1) / 2;
        }

        return pairs;
    }
}
