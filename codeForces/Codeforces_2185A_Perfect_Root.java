// Time: 218 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2185A_Perfect_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                ret.append(j).append(" ");
            }

            System.out.println(ret);
        }
    }
}
