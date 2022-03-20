// AC: Time: 187 ms  
// Memory 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_282A_Bit_plus_plus {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.nextInt();
        int ret = 0;
        while (sc.hasNext()) {
            String str = sc.next();
            if ("X++".equals(str) || "++X".equals(str)) {
                ret++;
            } else {
                ret--;
            }
        }
        System.out.println(ret);
    }
}
