// AC: Runtime: 3 ms, faster than 84.06% of Java online submissions for Next Greater Element I.
// Memory Usage: 41 MB, less than 5.30% of Java online submissions for Next Greater Element I.
// 略。
// T:O(n1 * n2), S:O(n2)
// 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size1 = nums1.length, size2 = nums2.length;

        HashMap<Integer, Integer> record2 = new HashMap<>();
        for (int i = 0; i < size2; i++) {
            record2.put(nums2[i], i);
        }

        int[] ret = new int[size1];
        for (int i = 0; i < size1; i++) {
            int index = record2.get(nums1[i]);
            boolean flag = false;
            for (int j = index + 1; j < size2; j++) {
                if (nums2[j] > nums1[i]) {
                    ret[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ret[i] = -1;
            }
        }

        return ret;
    }
}
