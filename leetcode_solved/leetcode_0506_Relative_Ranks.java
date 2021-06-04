// AC: Runtime: 6 ms, faster than 89.74% of Java online submissions for Relative Ranks.
// Memory Usage: 40 MB, less than 67.06% of Java online submissions for Relative Ranks.
// hashmap
// T:O(n), S:O(n)
//
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int size = score.length;
        String[] ret = new String[size];
        int[] scoreCopy = new int[size];
        System.arraycopy(score, 0, scoreCopy, 0, size);
        Arrays.sort(scoreCopy);
        HashMap<Integer, Integer> rank = new HashMap<>();
        for (int i = size - 1; i >= 0; i--) {
            rank.put(scoreCopy[i], size - i);
        }
        for (int i = 0; i < size; i++) {
            int rankIndex = rank.get(score[i]);
            String temp;
            switch (rankIndex) {
                case 1:
                    temp = "Gold Medal";
                    break;
                case 2:
                    temp = "Silver Medal";
                    break;
                case 3:
                    temp = "Bronze Medal";
                    break;
                default:
                    temp = String.valueOf(rankIndex);
            }
            ret[i] = temp;
        }
        
        return ret;
    }
}
