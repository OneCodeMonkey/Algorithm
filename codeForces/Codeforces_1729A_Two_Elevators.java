// AC: 342 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1729A_Two_Elevators {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = -1;
            if (b > c) {
                if (a == b) {
                    ret = 3;
                } else {
                    ret = a < b ? 1 : 2;
                }
            } else {
                if (a == 2 * c - b) {
                    ret = 3;
                } else {
                    ret = a < (2 * c - b) ? 1 : 2;
                }
            }
            System.out.println(ret);
        }
    }
}
