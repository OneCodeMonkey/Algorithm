// AC: 249 ms 
// Memory: 24700 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1367A_Short_Substrings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String b = sc.next();
            StringBuilder ret = new StringBuilder();
            ret.append(b.charAt(0));
            for (int j = 1; j < b.length(); j += 2) {
                ret.append(b.charAt(j));
            }
            System.out.println(ret.toString());
        }
    }
}
