// Time: 218 ms 
// Memory: 300 KB
// Math & constructive.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2093A_Ideal_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();

            System.out.println(k % 2 == 0 ? "NO" : "YES");
        }
    }
}
