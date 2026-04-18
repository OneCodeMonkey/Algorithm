// Runtime 1 ms Beats 87.49% 
// Memory 42.80 MB Beats 16.95%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int countCommas(int n) {
        return n >= 1000 ? n - 999 : 0;
    }
}
