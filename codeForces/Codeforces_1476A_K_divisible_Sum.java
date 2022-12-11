// AC: 234 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1476A_K_divisible_Sum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            if (n >= k) {
                System.out.println(n % k == 0 ? 1 : 2);
            } else {
                System.out.println((int) Math.ceil(k * 1.0 / n));
            }
        }
    }
}
