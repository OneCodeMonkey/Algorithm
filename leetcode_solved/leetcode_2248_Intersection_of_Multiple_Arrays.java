// AC: Runtime: 12 ms, faster than 15.77% of Java online submissions for Intersection of Multiple Arrays.
// Memory Usage: 47.4 MB, less than 21.78% of Java online submissions for Intersection of Multiple Arrays.
// .
// T:O(sum(nums[i].length)), S:O(max(nums[i].length))
// 
class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> record = new HashSet<>(), record2 = new HashSet<>();
        List<Integer> ret = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                if (record.isEmpty() || record.contains(i)) {
                    record2.add(i);
                }
            }
            if (record2.isEmpty()) {
                return ret;
            }
            record = new HashSet<>(record2);
            record2.clear();
        }
        ret = new ArrayList<>(record);
        Collections.sort(ret);

        return ret;
    }
}