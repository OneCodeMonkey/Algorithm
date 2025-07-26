// Runtime 26 ms Beats 61.40% 
// Memory 57.36 MB Beats 94.83%
// Greedy.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ret = 0, pos2 = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for (int player : players) {
            for (int i = pos2; i < trainers.length; i++) {
                if (player <= trainers[pos2]) {
                    ret++;
                    pos2++;
                    break;
                }
                pos2++;
            }
        }

        return ret;
    }
}
