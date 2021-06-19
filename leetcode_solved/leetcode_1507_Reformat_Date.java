// AC: Runtime: 10 ms, faster than 20.91% of Java online submissions for Reformat Date.
// Memory Usage: 39.7 MB, less than 6.21% of Java online submissions for Reformat Date.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String reformatDate(String date) {
        String[] dayArr = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
        String[] monthArr = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] arr = date.split(" ");
        int month = 0, day = 0, year = Integer.parseInt(arr[2]);
        for (int i = 0; i < 31; i++) {
            if (arr[0].equals(dayArr[i])) {
                day = i + 1;
                break;
            }
        }
        for (int i = 0; i < 12; i++) {
            if (arr[1].equals(monthArr[i])) {
                month = i + 1;
                break;
            }
        }

        return year + "-" + (month >= 10 ? month : "0" + month) + "-" + (day >= 10 ? day : "0" + day);
    }
}