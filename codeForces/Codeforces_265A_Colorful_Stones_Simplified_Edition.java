// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_265A_Colorful_Stones_Simplified_Edition {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next(), t = sc.next();
        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }
        System.out.println(pos + 1);
    }
}
