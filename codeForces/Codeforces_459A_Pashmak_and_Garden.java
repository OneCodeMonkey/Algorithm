// AC: 280 ms 
// Memory: 100 KB
// Geography.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_459A_Pashmak_and_Garden {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            if (x1 == x2) {
                int x = x1 + Math.abs(y1 - y2);
                System.out.println(x + " " + y1 + " " + x + " " + y2);
            } else if (y1 == y2) {
                int y = y1 + Math.abs(x1 - x2);
                System.out.println(x1 + " " + y + " " + x2 + " " + y);
            } else {
                System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
            }
        } else {
            System.out.println(-1);
        }
    }
}
