// AC: 218 ms 
// Memory: 0 KB
// Notice the remained can be over the range of Integer.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_686A_Free_Ice_Cream {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt(), ret = 0;
        long remain = x;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int d = sc.nextInt();
            if (s.equals("+")) {
                remain += d;
            } else {
                if (d <= remain) {
                    remain -= d;
                } else {
                    ret++;
                }
            }
        }
        System.out.println(remain + " " + ret);
    }
}
