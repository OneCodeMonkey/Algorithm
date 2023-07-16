// AC: 249 ms 
// Memory: 0 KB
// Tricky: notice a(n+1) = a(n) + minDigit * maxDigit, if we find some a(i) that contains 0, 
// then a(i+1), a(i+2), ... (an) will all be a(i), so the loop can stop.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1355A_Sequence_with_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a1 = sc.nextLong(), k = sc.nextLong();
            boolean flag = true;
            for (int j = 1; j < k; j++) {
                long b = a1;
                int minDigit = 10, maxDigit = 0;
                while (b > 0) {
                    int digit = (int) (b % 10);
                    minDigit = Math.min(minDigit, digit);
                    maxDigit = Math.max(maxDigit, digit);
                    if (minDigit == 0) {
                        flag = false;
                        break;
                    }
                    b /= 10;
                }
                if (!flag) {
                    break;
                }
                a1 += minDigit * maxDigit;
            }

            System.out.println(a1);
        }
    }
}
