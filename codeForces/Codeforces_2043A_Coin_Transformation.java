// Time: 359 ms 
// Memory: 1300 KB
// brute-force.
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2043A_Coin_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            int ret = 1;
            while (n >= 4) {
                n /= 4;
                ret *= 2;
            }
            System.out.println(ret);
        }
    }
}
