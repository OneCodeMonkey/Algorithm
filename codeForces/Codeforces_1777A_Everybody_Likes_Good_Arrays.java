// AC: 342 ms 
// Memory: 900 KB
// Math: the product of two same parity numbers is as same parity as these two numbers.
// T:O(sum(ni)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1777A_Everybody_Likes_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0, prev = sc.nextInt();
            for (int j = 1; j < n; j++) {
                int a = sc.nextInt();
                if ((a - prev) % 2 == 0) {
                    ret++;
                }
                prev = a;
            }

            System.out.println(ret);
        }
    }
}
