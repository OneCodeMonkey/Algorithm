// AC: 264 ms 
// Memory: 0 KB
// constructive, simple greedy strategy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1352B_Same_Parity_Summands {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int n = SC.nextInt(), k = SC.nextInt();
            if (n % 2 == 1) {
                if (k % 2 == 0) {
                    System.out.println("NO");
                } else {
                    if (k > n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                        for (int j = 0; j < k - 1; j++) {
                            System.out.print(1 + " ");
                        }
                        System.out.println(n - (k - 1));
                    }
                }
            } else {
                if (k % 2 == 0) {
                    if (k > n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                        for (int j = 0; j < k - 1; j++) {
                            System.out.print(1 + " ");
                        }
                        System.out.println(n - (k - 1));
                    }
                } else {
                    if (n < 2 * k) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                        for (int j = 0; j < k - 1; j++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println(n - 2 * (k - 1));
                    }
                }
            }
        }
    }
}
