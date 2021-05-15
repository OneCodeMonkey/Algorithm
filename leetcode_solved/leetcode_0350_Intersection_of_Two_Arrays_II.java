// AC:
// Runtime: 4 ms, faster than 23.55% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 38.9 MB, less than 88.63% of Java online submissions for Intersection of Two Arrays II.
// .
// T:O(max(nums1, nums2)), T:O(max(nums1, nums2))
//
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        List<Integer> ret = new LinkedList<>();
        HashMap<Integer, Integer> mapToCompare = new HashMap<>();
        if (len1 > len2) {
            for (Integer i: nums1) {
                mapToCompare.merge(i, 1, Integer::sum);
            }
            for (Integer i: nums2) {
                if (mapToCompare.get(i) != null && mapToCompare.get(i) > 0) {
                    ret.add(i);
                    mapToCompare.merge(i, -1, Integer::sum);
                }
            }
        } else {
            for (Integer i: nums2) {
                mapToCompare.merge(i, 1, Integer::sum);
            }
            for (Integer i: nums1) {
                if (mapToCompare.get(i) != null && mapToCompare.get(i) > 0) {
                    ret.add(i);
                    mapToCompare.merge(i, -1, Integer::sum);
                }
            }
        }

        int[] retArr = new int[ret.size()];
        int pos = 0;
        for (Integer i: ret) {
            retArr[pos++] = i;
        }
        return retArr;
    }
}