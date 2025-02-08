// AC: 265 ms 
// Time: 900 KB
// Math & game.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1973A_Chess_For_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt(), sum = p1 + p2 + p3, ret = 0;
            int maxVal = Math.max(Math.max(p1, p2), p3);
            if (sum % 2 == 1) {
                ret = -1;
            } else {
                if (maxVal > sum - maxVal) {
                    ret = sum - maxVal;
                } else {
                    ret = sum / 2;
                }
            }

            System.out.println(ret);
        }
    }
}
