// AC: 265 ms 
// Memory: 400 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2036A_Quintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt(), diff = Math.abs(a - prev);
                if (j == 0) {
                    prev = a;
                    continue;
                }
                if (flag && (diff != 5 && diff != 7)) {
                    flag = false;
                }
                prev = a;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
