// AC: 281 ms 
// Memory: 1000 KB
// Math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1354A_Alarm_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            long ret = 0;
            if (b >= a) {
                ret = b;
            } else {
                int remain = a - b;
                if (d >= c) {
                    ret = -1;
                } else {
                    if (remain % (c - d) == 0) {
                        ret = b + (long) c * (remain / (c - d));
                    } else {
                        ret = b + (long) c * (remain / (c - d) + 1);
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
