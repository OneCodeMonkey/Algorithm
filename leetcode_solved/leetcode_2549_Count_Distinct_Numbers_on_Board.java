// AC: Runtime 0 ms Beats 100%
// Memory 38.9 MB Beats 82.80%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int distinctIntegers(int n) {
        return n == 1 ? 1 : n - 1;
    }
}