// Runtime 1 ms Beats 100.00% 
// Memory 40.74 MB Beats 100.00%
// Since n <= 1000, brute-force & simulation
// T:O(n), S:O(1)
// 
class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        if (red < blue) {
            return maxHeightOfTriangle(blue, red);
        }
        int height1 = 0, height2 = 0, curRed = red, curBlue = blue, layer = 1, turn = 1;
        while (true) {
            if (turn == 1) {
                if (curRed > layer) {
                    curRed -= layer++;
                    turn = -1;
                    height1++;
                } else if (curRed == layer) {
                    curRed -= layer++;
                    turn = -1;
                    height1++;
                } else {
                    break;
                }
            } else {
                if (curBlue > layer) {
                    curBlue -= layer++;
                    turn = 1;
                    height1++;
                } else if (curBlue == layer) {
                    curBlue -= layer++;
                    turn = 1;
                    height1++;
                } else {
                    break;
                }
            }
        }
        curRed = red;
        curBlue = blue;
        layer = 1;
        turn = 1;
        while (true) {
            if (turn == -1) {
                if (curRed > layer) {
                    curRed -= layer++;
                    turn = 1;
                    height2++;
                } else if (curRed == layer) {
                    curRed -= layer++;
                    turn = 1;
                    height2++;
                } else {
                    break;
                }
            } else {
                if (curBlue > layer) {
                    curBlue -= layer++;
                    turn = -1;
                    height2++;
                } else if (curBlue == layer) {
                    curBlue -= layer++;
                    turn = -1;
                    height2++;
                } else {
                    break;
                }
            }
        }

        return Math.max(height1, height2);
    }
}
