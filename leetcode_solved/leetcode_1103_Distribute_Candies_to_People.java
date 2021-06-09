// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Distribute Candies to People.
// Memory Usage: 36.6 MB, less than 54.19% of Java online submissions for Distribute Candies to People.
// count the completed round and distribute the remain
// T:O(max(sqrt(2*candies), num_people)), S:O(1)
//
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ret = new int[num_people];
        if (num_people == 1) {
            ret[0] = candies;
            return ret;
        }

        int completeRound = (int) Math.sqrt(2 * candies / (num_people * num_people * 1.0));
        int completeRoundSum = 0;
        while (completeRound > 0) {
            completeRoundSum = 0;
            for (int i = 1; i <= completeRound; i++) {
                completeRoundSum += num_people * ((2 * i - 1) * num_people + 1) / 2;
            }
            int lastRound = candies - completeRoundSum;
            if (lastRound > 0 && lastRound <= num_people * ((2 * (completeRound + 1) - 1) * num_people + 1) / 2) {
                break;
            }
            completeRound--;
        }

        for (int i = 0; i < num_people; i++) {
            ret[i] = (i + 1) * completeRound + completeRound * (completeRound - 1) / 2 * num_people;
        }
        int remain = candies;
        if (completeRound != 0) {
            remain = candies - completeRoundSum;
        }
        for (int i = 0; i < num_people; i++) {
            int temp = (i + 1) + completeRound * num_people;
            if (temp >= remain) {
                ret[i] += remain;
                break;
            } else {
                ret[i] += temp;
                remain -= temp;
            }
        }

        return ret;
    }
}