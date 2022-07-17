// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_9A_Die_Roll {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int y = sc.nextInt(), w = sc.nextInt(), win = 7 - Math.max(y, w);
        if (win % 6 == 0) {
            System.out.println("1/1");
        } else if (win % 3 == 0) {
            System.out.println("1/2");
        } else if (win % 2 == 0) {
            System.out.println(win / 2 + "/3");
        } else {
            System.out.println(win + "/6");
        }
    }
}
