// Runtime 2 ms Beats 80.00% of users with Java
// Memory 44.57 MB Beats 60.00% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int[] resultArray(int[] nums) {
        int len = nums.length, lastInArr1 = 0, lastInArr2 = 0;
        int[] ret = new int[len];
        List<Integer> arr1 = new LinkedList<>(), arr2 = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                arr1.add(nums[i]);
                lastInArr1 = nums[i];
            } else if (i == 1) {
                arr2.add(nums[i]);

                lastInArr2 = nums[i];
            } else {
                if (lastInArr1 > lastInArr2) {
                    arr1.add(nums[i]);
                    lastInArr1 = nums[i];
                } else {
                    arr2.add(nums[i]);
                    lastInArr2 = nums[i];
                }
            }
        }
        int pos = 0;
        for (int i : arr1) {
            ret[pos++] = i;
        }
        for (int i : arr2) {
            ret[pos++] = i;
        }

        return ret;
    }
}
