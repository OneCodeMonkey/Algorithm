// AC: Runtime 0 ms Beats 100% 
// Memory 39 MB Beats 100%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int countDigits(int num) {
        int ret = 0, copy = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && copy % digit == 0) {
                ret++;
            }
            num /= 10;
        }

        return ret;
    }
}
