// AC: 404 ms 
// Memory: 0 KB
// n must be even. then change all pairs(any order，but change all pairs) respectively.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_233A_Perfect_Permutation {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(i - 1);
                }
                if (i != n) {
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println(-1);
        }
    }
}
