// AC: Runtime 7 ms Beats 100%
//  Memory 43.7 MB Beats 100%
// Two-pointers & Hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ret = 0, len = nums.length, countDistinct = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i : nums) {
            record.put(i, 0);
        }
        countDistinct = record.size();
        record.clear();
        for (int i = 0, leftPos = 0; i < len; i++) {
            record.merge(nums[i], 1, Integer::sum);
            while (record.size() == countDistinct) {
                ret += len - i;
                record.merge(nums[leftPos], -1, Integer::sum);
                if (record.get(nums[leftPos]) == 0) {
                    record.remove(nums[leftPos]);
                }
                leftPos++;
            }
        }

        return ret;
    }
}

