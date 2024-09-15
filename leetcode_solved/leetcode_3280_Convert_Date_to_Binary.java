// Runtime 3 ms Beats 100.00%
// Memory 42.49 MB Beats 100.00%
// .
// T:O(logn), S:O(logn)
// 
class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder ret = new StringBuilder();
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]), mon = Integer.parseInt(arr[1]), day = Integer.parseInt(arr[2]);
        ret.append(intToBinary(year));
        ret.append("-");
        ret.append(intToBinary(mon));
        ret.append("-");
        ret.append(intToBinary(day));

        return ret.toString();
    }

    public String intToBinary(int num) {
        if (num < 0) {
            return "";
        }
        if (num == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        while (num > 0) {
            ret.append(num % 2);
            num /= 2;
        }

        return ret.reverse().toString();
    }
}
