// AC: 滑动窗口法
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
// Memory Usage: 39.2 MB, less than 51.38% of Java online submissions for Two Sum II - Input array is sorted.
// 由于题设已告知有唯一解，那么必存在 i,j 满足条件，从首尾开始做滑动窗口逼近即可。
// T:O(n), S:O(1)
// 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length, left = 0, right = size - 1;
        int[] ret = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ret[0] = left + 1;
                ret[1] = right + 1;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return ret;
    }
}