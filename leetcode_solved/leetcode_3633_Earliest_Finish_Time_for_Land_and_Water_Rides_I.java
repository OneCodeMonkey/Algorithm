// Runtime 8 ms Beats 5.27% 
// Memory 44.89 MB Beats 93.04%
// Greedy.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        List<Integer> endTimes = new ArrayList<>();
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            endTimes.add(landStartTime[i] + landDuration[i]);
        }
        endTimes.sort(Comparator.naturalOrder());
        int earliest1 = endTimes.get(0);
        for (int i = 0; i < waterStartTime.length; i++) {
            int endTime = (Math.max(waterStartTime[i], earliest1)) + waterDuration[i];
            ret = Math.min(ret, endTime);
        }
        endTimes = new ArrayList<>();
        for (int i = 0; i < waterStartTime.length; i++) {
            endTimes.add(waterStartTime[i] + waterDuration[i]);
        }
        endTimes.sort(Comparator.naturalOrder());
        earliest1 = endTimes.get(0);
        for (int i = 0; i < landStartTime.length; i++) {
            int endTime = (Math.max(landStartTime[i], earliest1)) + landDuration[i];
            ret = Math.min(ret, endTime);
        }

        return ret;
    }
}
