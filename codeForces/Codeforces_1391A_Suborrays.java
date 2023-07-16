// AC: 202 ms 
// Memory: 0 KB
// Becase a | b >= a, so just make nj = n is ok.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1391A_Suborrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                if (j != n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
