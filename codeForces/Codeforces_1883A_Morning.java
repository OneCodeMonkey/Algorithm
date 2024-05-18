// AC: 280 ms 
// Memory: 900 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1883A_Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int cur = 1, ret = 0;
            for (char c : s.toCharArray()) {
                int c1 = c - '0';
                if (c1 == 0) {
                    c1 = 10;
                }
                if (c1 == cur) {
                    ret++;
                } else {
                    ret += Math.abs(c1 - cur) + 1;
                    cur = c1;
                }
            }

            System.out.println(ret);
        }
    }
}
