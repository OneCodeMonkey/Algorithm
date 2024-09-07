// AC: 358 ms 
// Memory: 300 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1989A_Catch_the_Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();

            System.out.println(y >= -1 ? "YES" : "NO");
        }
    }
}
