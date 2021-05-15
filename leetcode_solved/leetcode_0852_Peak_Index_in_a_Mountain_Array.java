// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
// Memory Usage: 38.8 MB, less than 90.53% of Java online submissions for Peak Index in a Mountain Array.
// binary search 二分查找。注意左右偏移时不用 left = mid + 1, right = mid - 1, 这样还要检查越界会比较麻烦。
//                       由于题目假定肯定存在满足的，所以只需 left = mid，right = mid, 这样mid 范围缩小到极限一定是答案
// T:O(log2(n)), S:O(1)
// 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (arr[mid + 1] > arr[mid] && arr[mid - 1] < arr[mid]) {
                left = mid;
            } else if (arr[mid + 1] < arr[mid] && arr[mid - 1] > arr[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}