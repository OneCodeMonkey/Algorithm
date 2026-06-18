// Time: 390 ms 
// Memory: 600 KB
// .
// T:O(t), S:(1)
// 
import java.util.Scanner;

public class Codeforces_2167A_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

            System.out.println(a == b && a == c && a == d ? "YES" : "NO");
        }
    }
}
