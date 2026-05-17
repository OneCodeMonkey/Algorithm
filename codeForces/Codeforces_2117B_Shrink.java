// Time: 249 ms 
// Memory: 1000 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2117B_Shrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            ret.append(1);
            for (int j = n; j >= 2; j--) {
                ret.append(" ").append(j);
            }

            System.out.println(ret);
        }
    }
}
