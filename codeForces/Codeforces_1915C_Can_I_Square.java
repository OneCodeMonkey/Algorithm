// AC: 545 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1915C_Can_I_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            long sqrtN = (long) Math.sqrt(sum);
            System.out.println(sqrtN * sqrtN == sum ? "YES" : "NO");
        }
    }
}
