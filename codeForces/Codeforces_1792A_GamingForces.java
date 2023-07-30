// AC: 327 ms 
// Memory: 0 KB
// If two elements are 1, then can kill both within one step, otherwise, kill everyone by one step is the better choice.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1792A_GamingForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countOne = 0;
            for (int j = 0; j < n; j++) {
                int h = sc.nextInt();
                if (h == 1) {
                    countOne++;
                }
            }
            int ret = (countOne % 2 == 0 ? countOne / 2 : (countOne / 2 + 1)) + (n - countOne);
            System.out.println(ret);
        }
    }
}
