// AC: Runtime: 20 ms, faster than 33.33% of Java online submissions for Find the Difference of Two Arrays.
// Memory Usage: 56.3 MB, less than 66.67% of Java online submissions for Find the Difference of Two Arrays.
// hashset
// T:O(m + n), S:O(m + n)
// 
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ret = new LinkedList<>();
        HashSet<Integer> both = new HashSet<>();
        HashSet<Integer> record2 = new HashSet<>();
        for (int i : nums2) {
            record2.add(i);
        }
        HashSet<Integer> ret1 = new HashSet<>();
        for (int i : nums1) {
            if (!record2.contains(i)) {
                ret1.add(i);
            } else {
                both.add(i);
            }
        }
        ret.add(new LinkedList<>(ret1));
        HashSet<Integer> ret2 = new HashSet<>();
        for (int i : nums2) {
            if (!both.contains(i)) {
                ret2.add(i);
            }
        }
        ret.add(new LinkedList<>(ret2));

        return ret;
    }
}
