// AC: Runtime: 1 ms, faster than 63.13% of Java online submissions for The Number of Full Rounds You Have Played.
// Memory Usage: 37.2 MB, less than 74.19% of Java online submissions for The Number of Full Rounds You Have Played.
// .
// T:O(len(startTime) + len(finishTime)), S:O(1)
//
class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        String[] arr1 = startTime.split(":"), arr2 = finishTime.split(":");
        int hour1 = Integer.parseInt(arr1[0]), minute1 = Integer.parseInt(arr1[1]), hour2 = Integer.parseInt(arr2[0]), minute2 = Integer.parseInt(arr2[1]);
        if (hour1 > hour2 || (hour1 == hour2 && minute1 > minute2)) {
            hour2 += 24;
        }
        int ret = 0;
        // gap at least one hour
        if (hour2 - hour1 >= 1) {
            ret += (hour2 - hour1 - 1) * 4;
            ret += (60 - minute1) / 15 + minute2 / 15;
        }
        // in same hour, compare minute.
        // notice if minute2 % 15 != 0 and ret > 0, will cause one quarter invalid.
        else {
            ret += (60 - minute1) / 15 - (60 - minute2) / 15;
            if (ret > 0 && minute2 % 15 != 0) {
                ret -= 1;
            }
        }

        return ret;
    }
}