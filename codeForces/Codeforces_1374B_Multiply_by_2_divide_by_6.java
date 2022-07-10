// AC: 390 ms 
// Memory: 0 KB
// .
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1374B_Multiply_by_2_divide_by_6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pow2Count = 0, pow3Count = 0;
            while (n > 1) {
                if (n % 2 != 0 && n % 3 != 0) {
                    break;
                }
                if (n % 2 == 0) {
                    n /= 2;
                    pow2Count++;
                }
                if (n % 3 == 0) {
                    n /= 3;
                    pow3Count++;
                }
            }
            if (n != 1 || (pow3Count < pow2Count)) {
                System.out.println(-1);
            } else {
                System.out.println(2 * pow3Count - pow2Count);
            }
        }
    }
}
