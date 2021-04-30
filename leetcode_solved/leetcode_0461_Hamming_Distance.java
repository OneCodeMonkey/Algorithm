// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
// Memory Usage: 35.7 MB, less than 47.39% of Java online submissions for Hamming Distance.
//
class Solution {
    public int hammingDistance(int x, int y) {
        int ret = 0;
        int max = Math.max(x, y), min = Math.min(x, y);
        while (max > 0) {
            if (min > 0) {
                if ((max % 2) != (min % 2)) {
                    ret++;
                }
                max = max >> 1;
                min = min >> 1;
            } else {
                if (max % 2 == 1) {
                    ret++;
                }
                max = max >> 1;
            }
        }

        return ret;
    }
}