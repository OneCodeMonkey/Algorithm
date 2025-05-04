// Time: 281 ms 
// Memory: 800 KB
// Math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1988A_Split_the_Multiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 0;
            if (n > 1) {
                ret = (n - 1) % (k - 1) == 0 ? (n - 1) / (k - 1) : ((n - 1) / (k - 1) + 1);
            }

            System.out.println(ret);
        }
    }
}
