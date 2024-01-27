// AC: 358 ms 
// Memory: 600 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1814A_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(), k = sc.nextLong();
            boolean flag = n % 2 != 1 || k % 2 != 0;

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
