// AC: 372 ms 
// Memory: 0 KB
// Notice: the end of line do not contain spaces.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0118B_Present_from_Lena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n + 1; i++) {
            if (i <= n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print(j <= i ? j : 2 * i - j);
                    if (j != 2 * i) {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < i - n; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * (2 * n - i) + 1; j++) {
                    System.out.print(j <= (2 * n - i) ? j : 2 * (2 * n - i) - j);
                    if (j != 2 * (2 * n - i)) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
