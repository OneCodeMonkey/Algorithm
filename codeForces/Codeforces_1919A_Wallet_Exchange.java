// AC: 124 ms 
// Memory: 0 KB
// In the optimal way, one can always convert to non-zero side, so just check the sum is odd or even.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1919A_Wallet_Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println((a + b) % 2 == 0 ? "Bob" : "Alice");
        }
    }
}
