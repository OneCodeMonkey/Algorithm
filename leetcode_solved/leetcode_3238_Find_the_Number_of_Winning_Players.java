// Runtime 10 ms Beats 100.00%
// Memory 45.31 MB Beats 100.00%
// Map.
// T:O(n), S:O(n)
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int prev = -1;
        Arrays.sort(pick, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        HashMap<Integer, Integer> count = new HashMap<>();
        HashSet<Integer> playerWin = new HashSet<>();
        for (int[] player : pick) {
            if (prev != -1 && player[0] != prev) {
                count.clear();
            }
            count.merge(player[1], 1, Integer::sum);
            if (count.get(player[1]) > player[0]) {
                playerWin.add(player[0]);
            }

            prev = player[0];
        }

        return playerWin.size();
    }
}
