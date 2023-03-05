// AC: Runtime 0 ms Beats 100% 
// Memory 39.1 MB Beats 100%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int passThePillow(int n, int time) {
        time = time % (2 * (n - 1));
        return 1 + (time <= (n - 1) ? time : (2 * (n - 1) - time));
    }
}
