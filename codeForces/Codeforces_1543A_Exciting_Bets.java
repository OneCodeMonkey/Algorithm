// AC: 312 ms 
// Memory: 0 KB
// The answer is abs(a - b), and nearest step is find min and abs(a - b) diff.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1543A_Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong(), b = sc.nextLong();
            if (a == b) {
                System.out.println("0 0");
            } else {
                if (a == 0 || b == 0) {
                    System.out.println((a + b) + " 0");
                    continue;
                }
                long max = Math.max(a, b), min = Math.min(a, b), ret = max - min, step = 0;
                if (ret >= min) {
                    step = Math.min(min, (ret - min));
                } else {
                    step = min % ret == 0 ? 0 : Math.min(min % ret, (min / ret + 1) * ret - min);
                }
                System.out.println(ret + " " + step);
            }
        }
    }
}
