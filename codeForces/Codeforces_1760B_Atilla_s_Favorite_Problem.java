// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1760B_Atilla_s_Favorite_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                ret = Math.max(ret, str.charAt(j) - 'a' + 1);
            }
            System.out.println(ret);
        }
    }
}
