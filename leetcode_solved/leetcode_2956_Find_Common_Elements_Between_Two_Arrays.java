// AC: Runtime 6 ms Beats 100.00% of users with Java
// Memory 44.06 MB Beats 100.00% of users with Java
// .
// T:O(m+n), S:O(max(m, n))
// 
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> record = new HashSet<>();
        int count1 = 0, count2 = 0;
        for (int i : nums2) {
            record.add(i);
        }
        for (int i : nums1) {
            if (record.contains(i)) {
                count1++;
            }
        }
        record.clear();
        for (int i : nums1) {
            record.add(i);
        }
        for (int i : nums2) {
            if (record.contains(i)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}
