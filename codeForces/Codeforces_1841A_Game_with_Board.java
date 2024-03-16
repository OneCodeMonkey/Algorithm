// AC: 218 ms 
// Memory: 600 KB
// Game: If n > 4, the first player just take n - 2 and put (n - 2), 
// then the second player have to take the two 1s. And the first win.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1841A_Game_with_Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println(n <= 4 ? "Bob" : "Alice");
        }
    }
}
