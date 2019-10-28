/**
 * AC：
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Power of Four.
 * Memory Usage: 8.2 MB, less than 52.38% of C++ online submissions for Power of Four.
 *
 */
class Solution {
public:
    bool isPowerOfFour(int num) {
        return fmod((log10(num)/log10(4)), 1) == 0;
    }
};