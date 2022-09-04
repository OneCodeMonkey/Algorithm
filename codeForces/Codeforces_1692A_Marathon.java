// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1692A_Marathon {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), ret = 0;
            for (int j : Arrays.asList(b, c, d)) {
                if (j > a) {
                    ret++;
                }
            }
            System.out.println(ret);
        }
    }
}
