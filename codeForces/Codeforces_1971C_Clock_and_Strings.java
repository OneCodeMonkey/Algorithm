// AC: 296 ms 
// Memory: 700 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1971C_Clock_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int min1 = Math.min(a, b), max1 = Math.max(a, b), min2 = Math.min(c, d), max2 = Math.max(c, d);
            boolean ret = (min1 < min2 && max1 < max2 && max1 > min2) || (min1 > min2 && max1 > max2 && max2 > min1);

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
