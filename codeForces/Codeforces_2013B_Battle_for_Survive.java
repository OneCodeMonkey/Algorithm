// Time: 624 ms 
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2013B_Battle_for_Survive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long ret = 0, sum1 = 0, last2 = 0, last1 = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j < n - 2) {
                    sum1 += a;
                } else if (j == n - 2) {
                    last2 = a;
                } else {
                    last1 = a;
                }
            }
            ret = n == 2 ? (last1 - last2) : (last1 - last2 + sum1);

            System.out.println(ret);
        }
    }
}
