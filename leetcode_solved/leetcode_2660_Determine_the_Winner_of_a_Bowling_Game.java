// AC: Runtime 2 ms Beats 100% 
// Memory 42.8 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int val1 = 0, val2 = 0, len = player1.length;
        for (int i = 0; i < len; i++) {
            val1 += player1[i];
            val2 += player2[i];
            if (i >= 1) {
                if (player1[i - 1] == 10 || (i >= 2 && player1[i - 2] == 10)) {
                    val1 += player1[i];
                }
                if (player2[i - 1] == 10 || (i >= 2 && player2[i - 2] == 10)) {
                    val2 += player2[i];
                }
            }
        }

        return val1 > val2 ? 1 : (val1 < val2 ? 2 : 0);
    }
}