// AC: 186 ms 
// Memory: 100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1674B_Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = 0;
            char c1 = s.charAt(0), c2 = s.charAt(1);
            ret += (c1 - 'a') * 25;
            if (c2 > c1) {
                ret += c2 - 'a';
            } else {
                ret += c2 - 'a' + 1;
            }

            System.out.println(ret);
        }
    }
}
