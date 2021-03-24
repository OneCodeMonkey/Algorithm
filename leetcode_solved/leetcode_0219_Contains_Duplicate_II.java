/**
 * AC: Runtime: 5 ms, faster than 91.91% of Java online submissions for Contains Duplicate II.
 * Memory Usage: 45 MB, less than 30.98% of Java online submissions for Contains Duplicate II.
 * T: O(n), S: O(n)
 * hashmap 存某个元素最近一次出现的位置，和当前如果相同的元素比较索引，如果之差绝对值 <= k 即满足返回。
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            if (record.get(nums[i]) != null) {
                if (i - record.get(nums[i]) <= k) {
                    return true;
                }
            }
            record.put(nums[i], i);
        }
        return false;
    }
}