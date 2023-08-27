// AC: Runtime 3 ms Beats 100%
// Memory 41.2 MB Beats 100%
// Binary Search.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ret = 0, len = nums.size();
        Collections.sort(nums);
        for (int i = 0; i < len; i++) {
            int pos = binarySearch(nums, i + 1, target - nums.get(i));
            if (pos != -1) {
                ret += pos - i;
            }
        }

        return ret;
    }

    // find the largest position where arr[i] < target
    private int binarySearch(List<Integer> arr, int beginPos, int target) {
        int left = beginPos, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target && (mid == 0 || arr.get(mid - 1) < target)) {
                return mid - 1;
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left >= arr.size()) {
            return left - 1;
        }
        if (left < 0 || arr.get(left) >= target) {
            return -1;
        }

        return left;
    }
}
