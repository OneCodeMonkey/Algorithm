// AC: 561 ms 
// Memory: 0 KB
// diff sequences by XOR sum.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_519B_A_and_B_and_Compilation_Errors {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), xOrSum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            xOrSum ^= a;
        }
        int xOrSum2 = 0;
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            xOrSum ^= a;
            xOrSum2 ^= a;
        }
        System.out.println(xOrSum);
        for (int i = 0; i < n - 2; i++) {
            int a = sc.nextInt();
            xOrSum2 ^= a;
        }
        System.out.println(xOrSum2);
    }
}
