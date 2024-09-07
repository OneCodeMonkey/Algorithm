// AC: 406 ms 
// Memory: 1000 KB
// Greedy, implementation.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1979A_Guess_the_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = Integer.MAX_VALUE, prev = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (prev == -1) {
                    prev = a;
                    continue;
                }
                int tempMax = Math.max(a, prev);
                ret = Math.min(ret, tempMax);
                prev = a;
            }

            System.out.println(ret - 1);
        }
    }
}
