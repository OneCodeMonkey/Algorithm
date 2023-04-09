// AC: 560 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0349A_Cinema_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count100 = 0, count50 = 0, count25 = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int coin = sc.nextInt();
            if (coin == 25) {
                count25++;
            } else if (coin == 50) {
                if (count25 <= 0) {
                    flag = false;
                    break;
                } else {
                    count25--;
                    count50++;
                }
            } else {
                // two change coin ways.
                if (count25 < 3 && (count25 <= 0 || count50 <= 0)) {
                    flag = false;
                    break;
                } else {
                    if (count50 >= 1) {
                        count25--;
                        count50--;
                    } else {
                        count25 -= 3;
                    }
                    count100++;
                }
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
