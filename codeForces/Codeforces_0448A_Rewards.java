// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0448A_Rewards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt(),
                b3 = sc.nextInt(), x = sc.nextInt();
        int sum1 = a1 + a2 + a3, sum2 = b1 + b2 + b3,
                needed = (sum1 % 5 == 0 ? sum1 / 5 : (sum1 / 5 + 1)) + (sum2 % 10 == 0 ? sum2 / 10 : (sum2 / 10 + 1));
        System.out.println(needed <= x ? "YES" : "NO");
    }
}
