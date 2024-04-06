// AC: 296 ms 
// Memory: 400 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1950C_Clock_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            String[] arr = str.split(":");
            StringBuilder ret = new StringBuilder();
            int hour = Integer.parseInt(arr[0]), minute = Integer.parseInt(arr[1]);
            if (hour >= 0 && hour <= 11) {
                if (hour == 0) {
                    ret.append("12:");
                } else {
                    if (hour < 10) {
                        ret.append("0");
                    }
                    ret.append(hour);
                    ret.append(":");
                }
                if (minute < 10) {
                    ret.append("0");
                }
                ret.append(minute);
                ret.append(" AM");
            } else {
                if (hour == 12) {
                    ret.append("12:");
                } else {
                    if (hour < 22) {
                        ret.append("0");
                    }
                    ret.append(hour - 12);
                    ret.append(":");
                }
                if (minute < 10) {
                    ret.append("0");
                }
                ret.append(minute);
                ret.append(" PM");
            }
            System.out.println(ret);
        }
    }
}
