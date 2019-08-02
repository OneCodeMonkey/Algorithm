class Solution {
public:
	/**
	 * AC:
	 * Runtime: 4 ms, faster than 80.61% of C++ online submissions for Divide Two Integers.
	 * Memory Usage: 8.2 MB, less than 77.72% of C++ online submissions for Divide Two Integers.
     *
     */
    int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1)
            return 2147483647;
        return dividend/divisor;
    }
};
