// AC: Runtime Details 0ms Beats 100.00%of users with Java
// Memory Details 39.13MB Beats 53.59%of users with Java
// Consider the binary representation of N, if in the sequence 10010011, contains single 1's bit, need one operation,
// If contains continous 1's, need first add 1 and remove 100000, two operations. So we can get the greedy answer.
// T:O(logn), S:O(1)
// 
class Solution {
    public int minOperations(int n) {
        int ret = 0;
        while (n > 0) {
            if ((n & 3) == 3) {
                n++;
                ret++;
            } else {
                ret += n & 1;
                n >>= 1;
            }
        }

        return ret;
    }
}
