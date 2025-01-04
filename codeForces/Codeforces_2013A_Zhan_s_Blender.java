// AC: 264 ms 
// Memory: 400 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2013A_Zhan_s_Blender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int x1 = (int) Math.ceil(n * 1.0 / x), y1 = (int) Math.ceil(n * 1.0 / y);

            System.out.println(Math.max(x1, y1));
        }
    }
}
