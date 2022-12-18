// AC: 327 ms 
// Memory: 0 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1611A_Make_Even {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n % 2 == 1) {
                boolean hasEvenDigit = false;
                while (n >= 10) {
                    int digit = n % 10;
                    if (digit % 2 == 0) {
                        hasEvenDigit = true;
                    }
                    n /= 10;
                }
                if (n % 2 == 0) {
                    hasEvenDigit = true;
                }
                if (!hasEvenDigit) {
                    ret = -1;
                } else {
                    if (n % 2 == 0) {
                        ret = 1;
                    } else {
                        ret = 2;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
