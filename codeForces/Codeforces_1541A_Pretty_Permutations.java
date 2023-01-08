// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1541A_Pretty_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 1; j <= (n % 2 == 0 ? n : n - 3); j++) {
                if (j % 2 == 1) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(j - 1);
                }
                if (j != n) {
                    System.out.print(" ");
                }
            }
            if (n % 2 == 1) {
                System.out.printf(" %d %d %d", n, n - 2, n - 1);
            }
            System.out.println();
        }
    }
}
