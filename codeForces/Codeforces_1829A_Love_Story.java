// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1829A_Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String target = "codeforces";
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = 0;
            for (int j = 0; j < 10; j++) {
                if (s.charAt(j) != target.charAt(j)) {
                    ret++;
                }
            }
            System.out.println(ret);
        }
    }
}
