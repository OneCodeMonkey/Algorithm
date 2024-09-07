// AC: 234 ms 
// Memory: 900 KB
// Constructive.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1983A_Array_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                ret.append(j + 1);
                if (j != n - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
