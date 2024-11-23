// AC: 327 ms 
// Memory: 1500 KB
// Bitmask. 交换律，a 异或 b = b 异或 a
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1805A_We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                ret ^= a;
            }

            System.out.println(n % 2 == 1 ? ret : (ret == 0 ? 1 : -1));
        }
    }
}
