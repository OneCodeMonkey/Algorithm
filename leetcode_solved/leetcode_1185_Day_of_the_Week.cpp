/**
 * AC: 最快的解法
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Day of the Week.
 * Memory Usage: 8 MB, less than 100.00% of C++ online submissions for Day of the Week.
 *
 * 思路：网上查到一个快捷公式。否则处理闰年的情况，代码会写很长。。这里偷鸡一下 :(
 * 基姆拉尔森计算公式
 * W= (d+2*m+3*(m+1)/5+y+y/4-y/100+y/400+1) mod 7
 * 注意把 一月和 二月换成上个月的 13月和14月来计算
 */
class Solution {
public:
    string dayOfTheWeek(int day, int month, int year) {
    	if(month == 1 || month == 2) {
    		month += 12;
    		year--;
    	}

        int W = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400 + 1) % 7;

        switch(W) {
        	case 0:
        		return "Sunday";
        	case 1:
        		return "Monday";
        	case 2:
        		return "Tuesday";
        	case 3:
        		return "Wednesday";
        	case 4:
        		return "Thursday";
        	case 5:
        		return "Friday";
        	case 6:
        		return "Saturday";
        }

        string s = "Monday";
        return s;
    }
};
