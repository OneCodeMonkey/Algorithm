// Time: 265 ms 
// Memory: 800 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2065B_Skibidus_and_Ohio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean flag = false;
            char prev = s.charAt(0);
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j + 1) == prev) {
                    flag = true;
                    break;
                }
                prev = s.charAt(j + 1);
            }

            System.out.println(flag ? 1 : s.length());
        }
    }
}
