/**
 * 思路：牛顿法，开方求平方根近似值的常用手法。
 *
 */
class Solution {
public:
    int mySqrt(int x) {
        if(x == 0)
        	return 0;
        long raw = x;
        while(raw * raw > x) {
        	raw = (raw + x / raw) / 2;
        }

        return raw;
    }
};