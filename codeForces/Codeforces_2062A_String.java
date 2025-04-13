// Time: 374 ms 
// Memory: 500 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2062A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ret++;
                }
            }

            System.out.println(ret);
        }
    }
}
