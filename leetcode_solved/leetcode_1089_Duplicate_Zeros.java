// AC: Runtime: 10 ms, faster than 51.81% of Java online submissions for Duplicate Zeros.
// Memory Usage: 39 MB, less than 79.19% of Java online submissions for Duplicate Zeros.
// in-place modification
// T:O(n^2), S:O(1)
//
class Solution {
    public void duplicateZeros(int[] arr) {
        int size = arr.length, prev, cur;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                if (i != size - 1) {
                    int j = i + 2;
                    prev = arr[j - 1];
                    while (j < size) {
                        cur = arr[j];
                        arr[j] = prev;
                        prev = cur;
                        j++;
                    }
                    arr[i + 1] = 0;
                }
                // forwarding one more bit
                i += 1;
            }
        }
    }
}