// AC: Runtime: 2 ms, faster than 40.00% of Java online submissions for Count Days Spent Together.
// Memory Usage: 42.1 MB, less than 40.00% of Java online submissions for Count Days Spent Together.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] days = new int[12];
        int sumDays = 0, pos = 0;
        for (int i = 0; i < 12; i++) {
            sumDays += months[i];
            days[pos++] = sumDays;
        }
        String[] arr1 = arriveAlice.split("-"), arr2 = leaveAlice.split("-"), arr3 = arriveBob.split("-"), arr4 = leaveBob.split("-");
        int month1 = Integer.parseInt(arr1[0]), day1 = Integer.parseInt(arr1[1]);
        int month2 = Integer.parseInt(arr2[0]), day2 = Integer.parseInt(arr2[1]);
        int month3 = Integer.parseInt(arr3[0]), day3 = Integer.parseInt(arr3[1]);
        int month4 = Integer.parseInt(arr4[0]), day4 = Integer.parseInt(arr4[1]);
        int startDate1 = month1 <= 1 ? day1 : (days[month1 - 2] + day1);
        int endDate1 = month2 <= 1 ? day2 : (days[month2 - 2] + day2);
        int startDate2 = month3 <= 1 ? day3 : (days[month3 - 2] + day3);
        int endDate2 = month4 <= 1 ? day4 : (days[month4 - 2] + day4);
        if (startDate2 > endDate1 || startDate1 > endDate2) {
            return 0;
        } else {
            return Math.min(endDate1, endDate2) - Math.max(startDate1, startDate2) + 1;
        }
    }
}
