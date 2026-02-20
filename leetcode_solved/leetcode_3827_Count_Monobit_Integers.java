// Runtime 1 ms Beats 99.28% 
// Memory 42.21 MB Beats 99.56%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int countMonobit(int n) {
        int ret = 1;
        int base = 1, exp = 1;
        while (base <= n) {
            ret++;
            base += exp * 2;
            exp *= 2;
        }

        return ret;
    }
}
