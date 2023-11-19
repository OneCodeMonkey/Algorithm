// AC: 327 ms 
// Memory: 0 KB
// Constructive: this game will pass if some round is finished, every round is 6 score on any monster and follow a 3 score on every monster.
// So the sum health is (9 * k) && (sum >= 9), and any health is not less then (sum/9). If this is true, then we can win.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1463A_Dungeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), sum = a + b + c;
            boolean ret = false;
            if (sum >= 9 && sum % 9 == 0) {
                int round = sum / 9;
                if (a >= round && b >= round && c >= round) {
                    ret = true;
                }
            }
            System.out.println(ret ? "YES" : "NO");
        }
    }
}
