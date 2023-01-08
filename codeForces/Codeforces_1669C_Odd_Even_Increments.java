// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1669C_Odd_Even_Increments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a1 = sc.nextInt(), a2 = sc.nextInt();
            int firstElementParity = a1 % 2, secondElementParity = a2 % 2;
            boolean flag = true;
            for (int j = 0; j < n - 2; j++) {
                int a = sc.nextInt();
                if (!flag) {
                    continue;
                }
                if (j % 2 == 0 && (a % 2) != firstElementParity) {
                    flag = false;
                }
                if (j % 2 == 1 && (a % 2) != secondElementParity) {
                    flag = false;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
