// AC: Runtime: 3 ms, faster than 38.24% of Java online submissions for Smallest Integer Divisible by K.
// Memory Usage: 37.6 MB, less than 27.94% of Java online submissions for Smallest Integer Divisible by K.
// if k is mod 2 or 5, then return -1. otherwise, using n = (n mod k) * 10 + 1, recursively check.
// T:O(10000), S:O(1)
//  
class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int rem = 1, len = 1, multiTime = 1, maxTime = (int) 1e5;
        while (rem % k != 0 && multiTime <= maxTime) {
            rem = (rem % k) * 10 + 1;
            len++;
            multiTime++;
        }

        return multiTime > maxTime ? -1 : len;
    }
}