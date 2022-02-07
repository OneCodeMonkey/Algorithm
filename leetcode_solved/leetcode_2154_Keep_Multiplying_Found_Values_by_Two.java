// AC: Runtime: 5 ms, faster than 51.63% of Java online submissions for Keep Multiplying Found Values by Two.
// Memory Usage: 45.4 MB, less than 40.38% of Java online submissions for Keep Multiplying Found Values by Two.
// hashset
// T:O(n), S:O(n)
// 
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> record = new HashSet<>();
        for (int i:nums) {
            record.add(i);
        }
        while (record.contains(original)) {
            original *= 2;
        }

        return original;
    }
}