// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1095A_Repeating_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), pos = 0;
        String s = sc.next();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; ) {
            ret.append(s.charAt(i));
            i += ++pos;
        }
        System.out.println(ret);
    }
}
