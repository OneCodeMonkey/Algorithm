// Time: 296 ms
// Memory: 1300 KB
// Constructive: since it not require to minimize the answers, we can simply construct a solution like below.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1869A_Make_It_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), xorSum = 0;
            boolean isAllZero = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                xorSum ^= a;
                if (isAllZero && a != 0) {
                    isAllZero = false;
                }
            }
            if (xorSum == 0) {
                System.out.println(isAllZero ? 0 : 1);
                if (!isAllZero) {
                    System.out.println(1 + " " + n);
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println(2);
                    System.out.println(1 + " " + n);
                    System.out.println(1 + " " + n);
                } else {
                    System.out.println(4);
                    System.out.println(1 + " " + n);
                    System.out.println(1 + " " + (n - 1));
                    System.out.println((n - 1) + " " + n);
                    System.out.println((n - 1) + " " + n);
                }
            }
        }
    }
}
