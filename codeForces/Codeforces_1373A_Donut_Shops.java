// AC: 265 ms 
// Memory: 0 KB
// Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1373A_Donut_Shops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            long ret1 = 0, ret2 = 0;
            if (a * b <= c) {
                ret1 = 1;
                ret2 = -1;
            } else {
                if (a >= c) {
                    ret1 = -1;
                } else {
                    ret1 = 1;
                }
                ret2 = b;
            }
            System.out.println(ret1 + " " + ret2);
        }
    }
}
