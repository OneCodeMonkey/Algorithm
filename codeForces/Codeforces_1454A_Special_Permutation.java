// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1454A_Special_Permutation {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j + 2 <= n) {
                    System.out.print(j + 2);
                } else {
                    System.out.print(1);
                }
                if (j != n - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
