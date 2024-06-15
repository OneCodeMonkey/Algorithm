// Runtime 0 ms Beats 100.00% of users with Java
// Memory 40.54 MB Beats 100.00% of users with Java
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int numberOfChild(int n, int k) {
        int remain = k % (2 * (n - 1));
        if (remain <= n - 1) {
            return remain;
        } else {
            return 2 * (n - 1) - remain;
        }
    }
}
