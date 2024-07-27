// Runtime 0 ms Beats 100.00%
// Memory 41.48 MB Beats 50.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String losingPlayer(int x, int y) {
        int round = Math.min(x, y / 4);

        return round % 2 == 1 ? "Alice" : "Bob";
    }
}
