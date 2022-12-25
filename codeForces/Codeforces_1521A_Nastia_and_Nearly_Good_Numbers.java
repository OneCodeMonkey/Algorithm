// AC: 405 ms 
// Memory: 200 KB
// Construct an answer format.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1521A_Nastia_and_Nearly_Good_Numbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (b == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (a >= b && a % b == 0) {
                    long x = (long) a * b, z = (long) (b + 1) * a;
                    System.out.println(x + " " + a + " " + z);
                } else {
                    if (b > 2) {
                        long x = (long) a * (b - 1), z = (long) a * b;
                        System.out.println(x + " " + a + " " + z);
                    } else {
                        long x = (long) a * (2L * b - 1), z = (long) a * 2 * b;
                        System.out.println(x + " " + a + " " + z);
                    }
                }
            }
        }
    }
}
