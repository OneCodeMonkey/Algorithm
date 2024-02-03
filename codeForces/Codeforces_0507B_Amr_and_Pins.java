// AC: 280 ms 
// Memory: 500 KB
// Geometry.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0507B_Amr_and_Pins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), x1 = sc.nextInt(), y1 = sc.nextInt(),
                xDelta = Math.abs(x - x1), yDelta = Math.abs(y - y1);
        double dis = Math.sqrt(xDelta * xDelta + yDelta * yDelta);
        int ret = (int) (dis / (2 * r));
        if (dis > 2 * r * ret) {
            ret++;
        }
        System.out.println(ret);
    }
}
