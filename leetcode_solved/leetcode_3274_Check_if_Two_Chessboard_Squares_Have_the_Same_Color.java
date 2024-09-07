// Runtime 0 ms Beats 100.00%
// Memory 41.46 MB Beats 100.00%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1 = coordinate1.charAt(0) - 'a', c2 = coordinate1.charAt(1) - '1', c3 = coordinate2.charAt(0) - 'a',
                c4 = coordinate2.charAt(1) - '1';
        int diff1 = Math.abs(c1 - c3), diff2 = Math.abs(c2 - c4);
        return Math.abs(diff1 - diff2) % 2 == 0;
    }
}
