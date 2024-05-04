// AC: 390 ms 
// Memory: 1400 KB
// Greedy, construtive.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1886A_Sum_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x1 = 0, x2 = 0, x3 = 0;
            boolean flag = true;
            if (n % 3 == 0) {
                if (n < 12) {
                    flag = false;
                } else {
                    x1 = 1;
                    x2 = 4;
                    x3 = n - 5;
                }
            } else if (n % 3 == 1) {
                if (n < 7) {
                    flag = false;
                } else {
                    x1 = 1;
                    x2 = 2;
                    x3 = n - 3;
                }
            } else {
                if (n < 8) {
                    flag = false;
                } else {
                    x1 = 1;
                    x2 = 2;
                    x3 = n - 3;
                }
            }

            if (flag) {
                System.out.println("YES");
                System.out.println(x1 + " " + x2 + " " + x3);
            } else {
                System.out.println("NO");
            }
        }
    }
}
