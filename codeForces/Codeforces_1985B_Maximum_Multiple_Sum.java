// AC: 249 ms 
// Memory: 700 KB
// math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1985B_Maximum_Multiple_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n % 2 == 0) {
                ret = 2;
            } else {
                if (n <= 3) {
                    ret = 3;
                } else {
                    ret = 2;
                }
            }

            System.out.println(ret);
        }
    }
}
