// AC: 187 ms 
// Memory: 0 KB
// bitmask
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_579A_Raising_Bacteria {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), ret = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                ret++;
            }
            x = x >> 1;
        }
        System.out.println(ret);
    }
}
