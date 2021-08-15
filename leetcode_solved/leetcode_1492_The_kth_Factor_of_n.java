// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for The kth Factor of n.
// Memory Usage: 35.9 MB, less than 55.27% of Java online submissions for The kth Factor of n.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int kthFactor(int n, int k) {
        int temp = 1, count = 0, step = 1;
        if (n % 2 == 1) {
            step = 2;
        }
        while (temp <= n) {
            if (n % temp == 0) {
                count++;
                if (count == k) {
                    return temp;
                }
            }
            temp += step;
        }

        return -1;
    }
}