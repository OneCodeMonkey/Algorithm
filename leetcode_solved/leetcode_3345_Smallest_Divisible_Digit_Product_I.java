// Runtime 0 ms Beats 100.00%
// Memory 40.63 MB Beats 100.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int smallestNumber(int n, int t) {
        int ret = 0, digitProduct = 1, n2 = n / 10;
        while (n2 > 0) {
            digitProduct *= n2 % 10;
            n2 /= 10;
        }
        for (int i = n; i <= (n / 10 * 10 + 10); i++) {
            if ((digitProduct * (i % 10)) % t == 0) {
                ret = i;
                break;
            }
        }

        return ret;
    }
}
