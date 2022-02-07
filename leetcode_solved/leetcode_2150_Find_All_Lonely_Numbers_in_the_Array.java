// AC: Runtime: 71 ms, faster than 79.13% of Java online submissions for Find All Lonely Numbers in the Array.
// Memory Usage: 65.7 MB, less than 82.60% of Java online submissions for Find All Lonely Numbers in the Array.
// hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        List<Integer> ret = new LinkedList<>();
        for (int i:record.keySet()) {
            if (record.get(i) == 1 && !record.containsKey(i + 1) && !record.containsKey(i - 1)) {
                ret.add(i);
            }
        }

        return ret;
    }
}