// AC: 296 ms 
// Memory: 900 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1900A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            String s = sc.next();
            if (s.contains("...")) {
                ret = 2;
            } else {
                for (char c : s.toCharArray()) {
                    if (c == '.') {
                        ret++;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
