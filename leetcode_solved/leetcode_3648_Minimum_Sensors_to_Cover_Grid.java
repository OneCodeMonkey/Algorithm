// Runtime 0 ms Beats 100.00% 
// Memory 40.69 MB Beats 99.21%
// math.
// T:O(1), S:O(1)
// 
class Solution {
    public int minSensors(int n, int m, int k) {
        int row = n % (2 * k + 1) == 0 ? n / (2 * k + 1) : (n / (2 * k + 1) + 1),
                col = m % (2 * k + 1) == 0 ? m / (2 * k + 1) : (m / (2 * k + 1) + 1);

        return row * col;
    }
}
