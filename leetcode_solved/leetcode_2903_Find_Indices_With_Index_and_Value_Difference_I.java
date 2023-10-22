// AC: Runtime 13 ms Beats 100%
// Memory 43.8 MB Beats 33.33%
// Prefix sum.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ret = new int[]{-1, -1};
        int len = nums.length;
        if (len == 1) {
            // side case
            if (indexDifference == 0 && valueDifference == 0) {
                ret = new int[]{0, 0};
            }
            return ret;
        }
        HashMap<Integer, Integer> valueToIndex = new HashMap<>();
        int[] suffixMin = new int[len], suffixMax = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                suffixMin[i] = nums[i];
                suffixMax[i] = nums[i];
            } else {
                suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
                suffixMax[i] = Math.max(nums[i], suffixMax[i + 1]);
            }
            valueToIndex.putIfAbsent(nums[i], i);
        }
//        System.out.println(Arrays.toString(suffixMin));
//        System.out.println(Arrays.toString(suffixMax));
//        System.out.println(valueToIndex);

        for (int i = 0; i + indexDifference < len; i++) {
            int suffixMinVal = suffixMin[i + indexDifference], suffixMaxVal = suffixMax[i + indexDifference];
            if (Math.abs(nums[i] - suffixMinVal) >= valueDifference) {
                ret[0] = i;
                ret[1] = valueToIndex.get(suffixMinVal);
//                System.out.println("1" + Arrays.toString(ret));
                return ret;
            }
            if (Math.abs(nums[i] - suffixMaxVal) >= valueDifference) {
                ret[0] = i;
                ret[1] = valueToIndex.get(suffixMaxVal);
                System.out.println("2" + Arrays.toString(ret));
                return ret;
            }
        }

        return ret;
    }
}
