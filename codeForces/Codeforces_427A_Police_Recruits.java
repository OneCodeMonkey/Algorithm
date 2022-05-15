// AC: 264 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_427A_Police_Recruits {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), cur = 0, ret = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k < 0) {
                if (cur < -k) {
                    ret += -k - cur;
                    cur = 0;
                } else {
                    cur += k;
                }
            } else {
                cur += k;
            }
        }

        System.out.println(ret);
    }
}
