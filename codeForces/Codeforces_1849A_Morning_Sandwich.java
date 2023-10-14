// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1849A_Morning_Sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        for (int i = 0; i < t; i++) {
            int b = sc.nextInt(), c = sc.nextInt(), h = sc.nextInt();
            ret = c + h >= b - 1 ? (b + b - 1) : (2 * (c + h) + 1);

            System.out.println(ret);
        }
    }
}
