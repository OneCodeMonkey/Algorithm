// Time: 312 ms 
// Memory: 500 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2044C_Hard_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = 0;
            ret = Math.min(m, a) + Math.min(m, b);
            ret = Math.min(2 * m, ret + c);

            System.out.println(ret);
        }
    }
}
