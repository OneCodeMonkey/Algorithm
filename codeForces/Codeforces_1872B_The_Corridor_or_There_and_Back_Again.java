// AC: 545 ms 
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1872B_The_Corridor_or_There_and_Back_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt(), s = sc.nextInt();
                ret = Math.min(ret, d + (s % 2 == 0 ? s / 2 - 1 : s / 2));
            }

            System.out.println(ret);
        }
    }
}
