// AC: 217 ms 
// Memory: 100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1907A_Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            char c1 = s.charAt(0);
            int row = Integer.parseInt(String.valueOf(s.charAt(1)));
            for (int j = 1; j <= 8; j++) {
                if (j != row) {
                    System.out.println(c1 + String.valueOf(j));
                }
            }
            for (int j = 'a'; j <= 'h'; j++) {
                if (j != c1) {
                    System.out.println((char) j + String.valueOf(row));
                }
            }
        }
    }
}
