// AC: Runtime 0 ms Beats 100% 
// Memory 41.8 MB Beats 50%
// judge from the right-most bit(from second)
// T:O(1), S:O(1)
// 
class Solution {
    public int countTime(String time) {
        int ret = 1;
        if (time.charAt(4) == '?') {
            ret = 10;
        }
        if (time.charAt(3) == '?') {
            ret *= 6;
        }
        char zeroBit = time.charAt(0);
        if (time.charAt(1) == '?') {
            if (zeroBit == '?') {
                ret *= 24;
            } else {
                if (zeroBit == '0' || zeroBit == '1') {
                    ret *= 10;
                } else {
                    ret *= 4;
                }
            }
        } else {
            if (zeroBit == '?') {
                if (time.charAt(1) >= '4') {
                    ret *= 2;
                } else {
                    ret *= 3;
                }
            }
        }

        return ret;
    }
}
