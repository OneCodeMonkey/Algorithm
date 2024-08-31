// AC: 406 ms 
// Memory: 1000 KB
// greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1978A_Alice_and_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), lastElement = -1, maxElementExceptLast = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (j == n - 1) {
                    lastElement = a;
                } else {
                    maxElementExceptLast = Math.max(maxElementExceptLast, a);
                }
            }

            System.out.println(lastElement + maxElementExceptLast);
        }
    }
}
