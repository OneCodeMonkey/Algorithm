// Runtime 2 ms Beats 100.00% 
// Memory 86.73 MB Beats 92.48%
// Recursion & Divide and conquer.
// T:O(n), S:O(n)
// 
class Solution {
    public static int cur = 0;

    public int[][] specialGrid(int n) {
        int row = (int) Math.pow(2, n);
        int[][] ret = new int[row][row];
        cur = 0;
        solve(ret, 0, 0, row - 1, row - 1);

        return ret;
    }

    private void solve(int[][] arr, int x1, int y1, int x2, int y2) {
        int segmentLen = x2 - x1 + 1;
        if (segmentLen == 1) {
            return;
        }
        if (segmentLen == 2) {
            arr[x1][y2] = cur++;
            arr[x2][y2] = cur++;
            arr[x2][y1] = cur++;
            arr[x1][y1] = cur++;
        } else {
            solve(arr, x1, y1 + segmentLen / 2, x1 + segmentLen / 2 - 1, y1 + segmentLen - 1);
            solve(arr, x1 + segmentLen / 2, y1 + segmentLen / 2, x1 + segmentLen - 1, y1 + segmentLen - 1);
            solve(arr, x1 + segmentLen / 2, y1, x1 + segmentLen - 1, y1 + segmentLen / 2 - 1);
            solve(arr, x1, y1, x1 + segmentLen / 2 - 1, y1 + segmentLen / 2 - 1);
        }
    }
}
