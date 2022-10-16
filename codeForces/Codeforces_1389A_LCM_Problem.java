// AC: 342 ms 
// Memory: 0 KB
// if 2 * l > r, then there is not such pair.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1389A_LCM_Problem {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            if (2 * l <= r) {
                System.out.println(l + " " + 2 * l);
            } else {
                System.out.println(-1 + " " + -1);
            }
        }
    }
}
