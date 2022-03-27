// AC: Time: 590 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_344A_Magnets {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 1;
        String prev = sc.next();
        while (sc.hasNext()) {
            String str = sc.next();
            if (!str.equals(prev)) {
                ret++;
            }
            prev = str;
        }

        System.out.println(ret);
    }
}
