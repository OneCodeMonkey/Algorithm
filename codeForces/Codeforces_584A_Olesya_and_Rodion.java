// AC: 186 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_584A_Olesya_and_Rodion {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), t = sc.nextInt();
        StringBuilder ret = new StringBuilder();
        if (t == 10) {
            if (n == 1) {
                System.out.println(-1);
            } else {
                ret.append("1".repeat(n - 1));
                ret.append(0);
                System.out.println(ret);
            }
        } else {
            ret.append(String.valueOf(t).repeat(n));
            System.out.println(ret);
        }
    }
}
