// AC: 218 ms 
// Memory: 1000 KB
// Can be proved that such special char is occurred by twice.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1948A_Special_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                StringBuilder ret = new StringBuilder();
                ret.append("AA");
                ret.append("BAA".repeat(Math.max(0, n / 2 - 1)));
                System.out.println(ret);
            }
        }
    }
}
