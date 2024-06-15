// AC: 327 ms 
// Memory: 800 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1895A_Treasure_Chest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt(), ret = x;
            if (y > x) {
                ret = y + (k >= (y - x) ? 0 : (y - x - k));
            }
            System.out.println(ret);
        }
    }
}
