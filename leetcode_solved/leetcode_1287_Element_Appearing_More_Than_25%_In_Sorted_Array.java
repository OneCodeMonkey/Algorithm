// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Element Appearing More Than 25% In Sorted Array.
// Memory Usage: 39.1 MB, less than 51.92% of Java online submissions for Element Appearing More Than 25% In Sorted Array.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length, tempCount = 1;
        if (size <= 3) {
            return arr[0];
        }
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) {
                tempCount = 1;
            } else {
                tempCount++;
                if (tempCount * 4 > size) {
                    return arr[i - 1];
                }
            }
        }

        return -1;
    }
}