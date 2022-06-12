// AC: 311 ms 
// Memory: 0 KB
// judge binary bit, check if there is a bit with value one and n > 1.
// T:(t * logn), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1475A_Odd_Divisor {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            boolean flag = true;
            while (n > 1) {
                if ((n & 1) == 1) {
                    flag = false;
                    System.out.println("YES");
                    break;
                }
                n >>= 1;
            }
            if (flag) {
                System.out.println("NO");
            }
        }
    }
}
