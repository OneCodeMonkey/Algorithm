// AC: Runtime: 15 ms, faster than 17.20% of Java online submissions for Day of the Year.
// Memory Usage: 39.8 MB, less than 14.81% of Java online submissions for Day of the Year.
// .
// T:O(1), S:O(1)
//
class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]), month = Integer.parseInt(arr[1]), day = Integer.parseInt(arr[2]), ret = 0;

        if (month <= 2) {
            ret = 31 * (month - 1) + day;
        } else {
            int[] monthDay = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            // 闰年
            if ((year % 4 == 0 && (year % 100 != 0)) || year % 400 == 0) {
                monthDay[1] = 29;
            }
            for (int i = 0; i < month - 1; i++) {
                ret += monthDay[i];
            }
            ret += day;
        }

        return ret;
    }
}