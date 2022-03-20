// AC: Time:374 ms 
// Memory:0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_231A_Team {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(), ret = 0, index = 0, count = 0;
        while (sc.hasNext()) {
            String word = sc.next();
            if ("1".equals(word)) {
                count++;
            }
            index++;
            if (index % 3 == 0) {
                ret += count >= 2 ? 1 : 0;
                count = 0;
            }
        }
        System.out.println(ret);
    }
}
