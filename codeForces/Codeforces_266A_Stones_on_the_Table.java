// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_266A_Stones_on_the_Table {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int len = sc.nextInt(), ret = 0;
        String str = sc.next();
        for (int i = 1; i < len; i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
