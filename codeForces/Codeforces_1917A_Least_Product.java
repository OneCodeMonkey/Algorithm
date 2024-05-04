// AC: 405 ms 
// Memory: 1100 KB
// T:O(sum(ni)), S:O(1)
// Greedy.
// 
import java.util.Scanner;

public class Codeforces_1917A_Least_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 1, firstNonZeroIndex = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                ret *= Integer.compare(a, 0);
                if (a != 0) {
                    firstNonZeroIndex = j + 1;
                }
            }
            if (ret <= 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
                System.out.println(firstNonZeroIndex + " 0");
            }
        }
    }
}
