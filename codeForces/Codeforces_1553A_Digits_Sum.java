// AC: 326 ms 
// Memory: 0 KB
// Find the number x that x <= n, and x % 10 == 9
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1553A_Digits_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int ret = n / 10;
            if (n % 10 == 9) {
                ret++;
            }

            System.out.println(ret);
        }
    }
}
