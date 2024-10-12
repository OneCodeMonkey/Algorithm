// AC: 717 ms 
// Memory: 1000 KB
// Greedy: every tool can contribute a-1 seconds most.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1875A_Jellyfish_and_Undertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            long sum1 = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                sum1 += Math.min(a - 1, x);
            }

            System.out.println(sum1 + b);
        }
    }
}
