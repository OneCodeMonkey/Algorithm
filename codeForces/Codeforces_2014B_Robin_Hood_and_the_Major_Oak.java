// AC: 374 ms 
// Memory: 1100 KB
// Math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2014B_Robin_Hood_and_the_Major_Oak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            boolean flag;
            if (k % 2 == 0) {
                flag = (k / 2) % 2 == 0;
            } else {
                int remain = k - 1;
                if ((remain / 2) % 2 == 0) {
                    flag = n % 2 == 0;
                } else {
                    flag = n % 2 == 1;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
