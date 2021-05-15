// AC:
// Runtime: 2 ms, faster than 93.02% of Java online submissions for Intersection of Two Arrays.
// Memory Usage: 38.7 MB, less than 95.04% of Java online submissions for Intersection of Two Arrays.
// 思路：用集合来判断存不存在，一次查询复杂度仅 O(1)
// T:O(max(nums1, nums2)), S:O(max(nums1, nums2))
//
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        HashSet<Integer> ret = new HashSet<>();
        HashSet<Integer> setToCompare = new HashSet<>();
        if (len1 > len2) {
            for (Integer i: nums1) {
                setToCompare.add(i);
            }
            for (Integer i: nums2) {
                if (setToCompare.contains(i)) {
                    ret.add(i);
                }
            }
        } else {
            for (Integer i: nums2) {
                setToCompare.add(i);
            }
            for (Integer i: nums1) {
                if (setToCompare.contains(i)) {
                    ret.add(i);
                }
            }
        }

        int[] retArr = new int[ret.size()];
        Iterator<Integer> it = ret.iterator();
        int pos = 0;
        while (it.hasNext()) {
            retArr[pos++] = it.next();
        }
        return retArr;

        // 用 stream() 语法简洁当时非常慢，
        // Runtime: 4 ms, faster than 23.43% of Java online submissions for Intersection of Two Arrays.
		// Memory Usage: 39.3 MB, less than 31.76% of Java online submissions for Intersection of Two Arrays.
        // -
        // return ret.stream().mapToInt(Integer::valueOf).toArray();
    }
}