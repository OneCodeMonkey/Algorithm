// AC: 233 ms 
// Memory: 0 KB
// when x < 20, we should not use spell 1.
// T:O(sum(logxi)), S:O(max(logxi))
// 
import java.util.Scanner;

public class Codeforces_1337B_Kana_and_Dragon_Quest_game {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
            while (x > 0) {
                if (x >= 20) {
                    if (n > 0) {
                        x = x / 2 + 10;
                        n--;
                    } else if (m > 0) {
                        x -= 10;
                        m--;
                    } else {
                        break;
                    }
                } else {
                    if (m > 0) {
                        x -= 10;
                        m--;
                    } else {
                        break;
                    }
                }
            }

            System.out.println(x <= 0 ? "YES" : "NO");
        }
    }
}
