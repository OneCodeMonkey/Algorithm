// Time: Runtime 0 ms Beats 100% 
// Memory: 41.5 MB Beats 25%
// geometry.
// T:O(logn), S:O(1)
// 
class Solution {
    public int numberOfCuts(int n) {
        int count1 = 0, ret = 0;
        if (n > 1) {
            while (n % 2 == 0) {
                count1++;
                n /= 2;
            }
            if (count1 == 0) {
                ret = n;
            } else {
                ret = (int) Math.pow(2, count1 - 1) * n;
            }
        }

        return ret;
    }
}
