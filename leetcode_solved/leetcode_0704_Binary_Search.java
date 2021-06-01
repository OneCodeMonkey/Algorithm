// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
// Memory Usage: 39.8 MB, less than 53.16% of Java online submissions for Binary Search.
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        if (size == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0, right = size - 1;
        while (left <= right) {
            if (left == right) {
                return nums[left] == target ? left : -1;
            }
            
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}