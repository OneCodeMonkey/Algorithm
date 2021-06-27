// AC: Runtime: 1 ms, faster than 98.55% of Java online submissions for Number of Days Between Two Dates.
// Memory Usage: 37.5 MB, less than 37.05% of Java online submissions for Number of Days Between Two Dates.
// .
// T:O(Math.abs(year1 - year2)), S:O(1)
// 
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        String[] arr1 = date1.split("-");
        String[] arr2 = date2.split("-");
        int year1 = Integer.parseInt(arr1[0]), month1 = Integer.parseInt(arr1[1]), day1 = Integer.parseInt(arr1[2]), year2 = Integer.parseInt(arr2[0]), month2 = Integer.parseInt(arr2[1]), day2 = Integer.parseInt(arr2[2]);
        if (year1 < year2 || (year1 == year2 && month1 < month2) || (year1 == year2 && month1 == month2 && day1 < day2)) {
            return daysBetweenDates(date2, date1);
        }

        int[] monthArr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int gapYearDays = 0;
        for (int i = year2 + 1; i < year1; i++) {
            if (checkYear(i)) {
                gapYearDays += 366;
            } else {
                gapYearDays += 365;
            }
        }
        int year2Days = 0;
        for (int i = 0; i < month2 - 1; i++) {
            if (i == 1) {
                if (checkYear(year2)) {
                    year2Days += 1;
                }
            }
            year2Days += monthArr[i];
        }
        year2Days += day2;
        year2Days = checkYear(year2) ? 366 - year2Days : 365 - year2Days;

        int year1Days = 0;
        for (int i = 0; i < month1 - 1; i++) {
            if (i == 1) {
                if (checkYear(year1)) {
                    year1Days += 1;
                }
            }
            year1Days += monthArr[i];
        }
        year1Days += day1;

        if (year1 > year2) {
            return gapYearDays + year1Days + year2Days;
        } else {
            return year2Days - (checkYear(year1) ? 366 - year1Days : 365 - year1Days);
        }
    }

    private boolean checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }
}