// AC: 295 ms 
// Memory: 0 KB
// number of edges must be 4 * k.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1369A_FashionabLee {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n % 4 == 0 ? "YES" : "NO");
        }
    }
}
