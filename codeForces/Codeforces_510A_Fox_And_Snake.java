// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(n * m), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_510A_Fox_And_Snake {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), cur = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            } else {
                if (i % 4 == 2) {
                    for (int j = 1; j <= m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 1; j <= m - 1; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}
