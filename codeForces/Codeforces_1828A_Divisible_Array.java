// AC: 312 ms 
// Memory: 300 KB
// For n is odd, return [1,2,...,n], for n is even, return [2,4,...,2n]
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1828A_Divisible_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                    if (j != n) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(2 * j);
                    if (j != n) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }
}
