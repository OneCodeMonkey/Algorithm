// Time: 249 ms 
// Memory: 1500 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2126A_Only_One_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 9;
            while (n > 0) {
                ret = Math.min(ret, n % 10);
                n /= 10;
            }
            System.out.println(ret);
        }
    }
}
