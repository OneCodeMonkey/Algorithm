// Runtime 0 ms Beats 100.00% 
// Memory 42.35 MB Beats 68.12%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int minCost(int n) {
        return n == 1 ? 0 : (n - 1) * n / 2;
    }
}
