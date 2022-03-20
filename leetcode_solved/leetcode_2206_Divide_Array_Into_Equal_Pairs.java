// AC: Runtime: 12 ms, faster than 57.14% of Java online submissions for Divide Array Into Equal Pairs.
// Memory Usage: 47.7 MB, less than 28.57% of Java online submissions for Divide Array Into Equal Pairs.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        for (int i : record.keySet()) {
            if (record.get(i) % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}