// Runtime 16 ms Beats 93.12% 
// Memory 48.01 MB Beats 22.66%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int maxDistance(String moves) {
        int vU = 0, vD = 0, hL = 0, hR = 0, space = 0;
        for (char c : moves.toCharArray()) {
            if (c == '_') {
                space++;
            } else if (c == 'U') {
                vU++;
            } else if (c == 'D') {
                vD++;
            } else if (c == 'L') {
                hL++;
            } else if (c == 'R') {
                hR++;
            }
        }
        int vertical = Math.abs(vU - vD), horizontal = Math.abs(hL - hR);

        return vertical + horizontal + space;
    }
}
