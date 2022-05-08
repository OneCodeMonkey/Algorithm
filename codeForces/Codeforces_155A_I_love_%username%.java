// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_155A_I_love_username {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), maxVal = 0, minVal = Integer.MAX_VALUE, ret = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i == 0) {
                maxVal = Math.max(maxVal, a);
                minVal = a;
            } else {
                if (a > maxVal) {
                    ret++;
                    maxVal = a;
                } else if (a < minVal) {
                    ret++;
                    minVal = a;
                }
            }
        }

        System.out.println(ret);
    }
}
