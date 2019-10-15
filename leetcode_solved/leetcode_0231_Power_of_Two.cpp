/**
 * AC:
 * Runtime: 4 ms, faster than 56.88% of C++ online submissions for Power of Two.
 * Memory Usage: 8 MB, less than 100.00% of C++ online submissions for Power of Two.
 * 
 * 思路：用位运算。如果是 2^n (n>=0)，那么 n&(n - 1) = 0,反之则 n&(n - 1)=1
 */
class Solution {
public:
    bool isPowerOfTwo(int n) {
    	return n > 0 && !(n & (n - 1));    
    }
};