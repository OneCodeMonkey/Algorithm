// AC: 374 ms 
// Memory: 1100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2009C_The_Legend_of_Freya_the_Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt(), ret = 0;
            int x1 = 2 * (int) Math.ceil(x * 1.0 / k) - 1, y1 = 2 * (int) Math.ceil(y * 1.0 / k);

            System.out.println(Math.max(x1, y1));
        }
    }
}
