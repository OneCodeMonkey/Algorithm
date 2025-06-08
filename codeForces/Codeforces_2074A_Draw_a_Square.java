// Time: 281 ms 
// Memory: 200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2074A_Draw_a_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), d = sc.nextInt(), u = sc.nextInt();
            boolean ret = l == r && r == d && d == u;

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
