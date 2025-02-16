// Time: 249 ms 
// Memory: 1000 KB
// Math.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2063A_Minimal_Coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), ret = 0;
            if (l == 1 && r == 1) {
                ret = 1;
            } else {
                ret = r - l;
            }

            System.out.println(ret);
        }
    }
}
