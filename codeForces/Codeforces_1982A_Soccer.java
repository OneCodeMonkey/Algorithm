// AC: 358 ms 
// Memory: 500 KB
// Game: 找反例.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1982A_Soccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            boolean ret = true;
            if (x1 < y1 && x2 >= y2) {
                ret = false;
            } else if (x1 > y1 && y2 >= x2) {
                ret = false;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
