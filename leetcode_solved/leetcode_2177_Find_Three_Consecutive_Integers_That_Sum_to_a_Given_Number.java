// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Three Consecutive Integers That Sum to a Given Number.
// Memory Usage: 40.5 MB, less than 20.00% of Java online submissions for Find Three Consecutive Integers That Sum to a Given Number.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public long[] sumOfThree(long num) {
        long[] ret = new long[0];
        if (num % 3 == 0) {
            ret = new long[3];
            long middle = num / 3;
            ret[0] = middle - 1;
            ret[1] = middle;
            ret[2] = middle + 1;
        }

        return ret;
    }
}