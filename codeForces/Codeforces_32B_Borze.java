// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_32B_Borze {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ret.append(0);
            } else if (s.charAt(i) == '-') {
                if (s.charAt(i + 1) == '.') {
                    ret.append(1);
                } else {
                    ret.append(2);
                }
                i++;
            }
        }
        System.out.println(ret);
    }
}
