// AC: 311 ms 
// Memory: 1000 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1932A_Thorns_and_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            for (int j = 1; j < n; j++) {
                char c = s.charAt(j);
                if (c == '@') {
                    ret++;
                } else if (c == '*' && j + 1 < n) {
                    if (s.charAt(j + 1) == '*') {
                        break;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
