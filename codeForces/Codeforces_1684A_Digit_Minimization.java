// Time: 312 ms 
// Memory: 300 KB
// Greedy.
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1684A_Digit_Minimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int maxDigit = 9, firstDigit = -1, exp = 0;
            while (n > 0) {
                if (firstDigit == -1) {
                    firstDigit = n % 10;
                }
                maxDigit = Math.min(maxDigit, n % 10);
                n /= 10;
                exp++;
            }

            System.out.println(exp == 2 ? firstDigit : maxDigit);
        }
    }
}
