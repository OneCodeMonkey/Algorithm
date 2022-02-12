// AC: Runtime: 7 ms, faster than 86.39% of Java online submissions for K-diff Pairs in an Array.
// Memory Usage: 42.1 MB, less than 63.11% of Java online submissions for K-diff Pairs in an Array.
// hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int count = 0;
        for (int i:nums) {
            if (k == 0) {
                if (record.containsKey(i) && record.get(i) == 1) {
                    count++;
                }
                record.merge(i, 1, Integer::sum);
            } else {
                if (record.containsKey(i + k) && !record.containsKey(i)) {
                    count++;
                }
                if (record.containsKey(i - k) && !record.containsKey(i)) {
                    count++;
                }
                record.putIfAbsent(i, 1);
            }
        }

        return count;
    }
}