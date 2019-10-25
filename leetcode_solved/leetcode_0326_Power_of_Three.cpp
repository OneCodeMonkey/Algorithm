/**
 * AC：
 * Runtime: 16 ms, faster than 67.62% of C++ online submissions for Power of Three.
 * Memory Usage: 8.2 MB, less than 66.67% of C++ online submissions for Power of Three.
 * 思路: 转换为求 log3(n) 是否是整数。
 *
 */
class Solution {
public:
    bool isPowerOfThree(int n) {
        double power = log10(n) / log10(3);
        if(fmod(power, 1) == 0)		// 指数为整数
        	return true;

        return false;
    }
};