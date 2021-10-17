// AC: Runtime: 5 ms, faster than 75.62% of Java online submissions for Two Out of Three.
// Memory Usage: 39.8 MB, less than 82.45% of Java online submissions for Two Out of Three.
// hashset
// T:(m^2 * n), S:O(n),  m is number of arrays, n is array size.
// 
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> record = new HashSet<>();
        record.addAll(solve(nums1, nums2));
        record.addAll(solve(nums1, nums3));
        record.addAll(solve(nums2, nums3));
        return new LinkedList<>(record);
    }

    private HashSet<Integer> solve(int[] nums1, int[] nums2) {
        int size1 = nums1.length, size2 = nums2.length;
        HashSet<Integer> record = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();
        if (size1 > size2) {
            for (int i: nums1) {
                temp.add(i);
            }
            for (int i: nums2) {
                if (temp.contains(i)) {
                    record.add(i);
                }
            }
        } else {
            for (int i: nums2) {
                temp.add(i);
            }
            for (int i: nums1) {
                if (temp.contains(i)) {
                    record.add(i);
                }
            }
        }

        return record;
    }
}