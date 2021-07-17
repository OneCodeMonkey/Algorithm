// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
// Memory Usage: 38.4 MB, less than 77.63% of Java online submissions for Find Peak Element.
// binary search, before next iteration we can judge element's neighbors and may return in advance.
// T:O(logn), S:O(1)
// 
class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        return binarySearch(nums, start, end);
    }

    private int binarySearch(int[] arr, int start, int end) {
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2, mid2 = mid + 1;
        if (arr[mid] > arr[mid2]) {
            if (mid - 1 > 0 && arr[mid - 1] < arr[mid]) {
                return mid;
            }
            return binarySearch(arr, start, mid);
        } else {
            if (mid2 + 1 <= end && arr[mid2 + 1] < arr[mid2]) {
                return mid2;
            }
            return binarySearch(arr, mid2, end);
        }
    }
}