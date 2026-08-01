// AC: 281 ms 
// Memory: 200 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2193A_DBMB_and_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), s = sc.nextInt(), x = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            String ret = "NO";
            if (sum <= s) {
                if ((s - sum) % x == 0) {
                    ret = "YES";
                }
            }
            System.out.println(ret);
        }
    }
}
