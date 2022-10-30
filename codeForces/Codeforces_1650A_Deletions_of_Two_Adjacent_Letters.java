// AC: 218 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length)), S:O(max(si.length))
// 
import java.util.Scanner;

public class Codeforces_1650A_Deletions_of_Two_Adjacent_Letters {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next(), c = sc.next();
            char compare = c.charAt(0);
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == compare && j % 2 == 0) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
