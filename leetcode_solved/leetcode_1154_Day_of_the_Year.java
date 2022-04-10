// AC: Runtime: 11 ms, faster than 86.41% of Java online submissions for Day of the Year.
// Memory Usage: 42.5 MB, less than 93.32% of Java online submissions for Day of the Year.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int dayOfYear(String date) {
        List<Integer> normalYear = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
                specialYear = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        String[] arr = date.split("-");
        int ret = 0, year = Integer.parseInt(arr[0]), month = Integer.parseInt(arr[1]), day = Integer.parseInt(arr[2]);
        if (checkYear(year)) {
            for (int i = 0; i < month - 1; i++) {
                ret += specialYear.get(i);
            }
            ret += day;
        } else {
            for (int i = 0; i < month - 1; i++) {
                ret += normalYear.get(i);
            }
            ret += day;
        }

        return ret;
    }

    private boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}