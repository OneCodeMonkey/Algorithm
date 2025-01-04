// AC: 843 ms 
// Memory: 1100 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2014A_Robin_Helps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), cur = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a >= k) {
                    cur += a;
                } else if (a == 0 && cur > 0) {
                    cur--;
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
