// AC: Runtime 1 ms Beats 100% 
// Memory 40.6 MB Beats 100%
// .
// T:O(m + n), S:O(m)
// 
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int commonSmallest = Integer.MAX_VALUE, smallest1 = Integer.MAX_VALUE, smallest2 = Integer.MAX_VALUE;
        HashSet<Integer> record1 = new HashSet<>();
        for (int i : nums1) {
            record1.add(i);
            smallest1 = Math.min(smallest1, i);
        }
        for (int i : nums2) {
            if (record1.contains(i)) {
                commonSmallest = Math.min(commonSmallest, i);
            }
            smallest2 = Math.min(smallest2, i);
        }

        if (commonSmallest != Integer.MAX_VALUE) {
            return commonSmallest;
        }

        return smallest1 <= smallest2 ? (smallest1 * 10 + smallest2) : (smallest2 * 10 + smallest1);
    }
}