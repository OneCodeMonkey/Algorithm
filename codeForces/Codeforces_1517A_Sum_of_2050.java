// AC: 264 ms 
// Memory: 0 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1517A_Sum_of_2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            int ret = -1;
            if (n % 2050 == 0) {
                long divider = n / 2050;
                ret = 0;
                while (divider > 0) {
                    int digit = (int) (divider % 10);
                    ret += digit;
                    divider /= 10;
                }
            }

            System.out.println(ret);
        }
    }
}
