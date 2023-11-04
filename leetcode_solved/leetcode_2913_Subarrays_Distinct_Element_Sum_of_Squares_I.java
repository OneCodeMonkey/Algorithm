// AC: Runtime Details 6ms Beats 100.00%of users with Java
// Memory Details 43.15MB Beats 100.00%of users with Java
// Hashset.
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public int sumCounts(List<Integer> nums) {
        int len = nums.size(), ret = 0;
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < len; i++) {
            record.clear();
            for (int j = i; j < len; j++) {
                record.add(nums.get(j));
                ret += record.size() * record.size();
            }
        }

        return ret;
    }
}
