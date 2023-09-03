// AC: Runtime 11 ms Beats 100%
// Memory 39.7 MB Beats 100%
// .
// T:O(nlogn), S:O(1)
// 
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ret = 0;
        for (int i = low; i <= high; i++) {
            if (i >= 10 && i <= 99) {
                if (i % 10 == i / 10) {
                    ret++;
                }
            } else if (i >= 1000 && i <= 9999) {
                int d1 = i % 10, d2 = (i / 10) % 10, d3 = (i / 100) % 10, d4 = i / 1000;
                if (d1 + d2 == d3 + d4) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
