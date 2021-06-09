// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Mountain Array.
// Memory Usage: 40.1 MB, less than 48.47% of Java online submissions for Valid Mountain Array.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean validMountainArray(int[] arr) {
        int size = arr.length, l = 0, r = size - 1;
        while (l + 1 < size && arr[l] < arr[l + 1]) {
            l++;
        }
        while (r - 1 > 0 && arr[r] < arr[r - 1]) {
            r--;
        }

        return l > 0 && r < size - 1 && l == r;
    }
}