// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0450B_Jzzhu_and_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt(), ret = 0, modN = 1_000_000_007;
        int[] five = new int[]{x, y, y - x, -x, -y}, sixAbove = new int[]{x - y, x, y, y - x, -x, -y};
        if (n < 6) {
            ret = five[n - 1];
        } else {
            int mod = (n - 5) % 6;
            ret = sixAbove[mod == 0 ? 5 : (mod - 1)];
        }

        if (ret < 0) {
            ret = (ret + 2 * modN) % modN;
        } else {
            ret = ret % modN;
        }

        System.out.println(ret);
    }
}
