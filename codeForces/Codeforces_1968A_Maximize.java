// AC: 281 ms 
// Memory: 900 KB
// Math: since 1 <= y < x, we can prove that gcd(x, y) + y <= x. Notice when y = x - 1, 
//       the value of gcd(x, y) + y == x, so this is one of the answer.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1968A_Maximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();

            System.out.println(x - 1);
        }
    }
}
