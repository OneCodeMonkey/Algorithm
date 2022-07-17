// AC: 327 ms 
// Memory: 0 KB
// .
// T:O(sum(logw * logh)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1472A_Cards_for_Friends {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt(), maxPiece = 1;
            while (w % 2 == 0) {
                maxPiece *= 2;
                w /= 2;
            }
            if (maxPiece >= n) {
                System.out.println("YES");
                continue;
            }
            while (h % 2 == 0) {
                maxPiece *= 2;
                h /= 2;
            }
            if (maxPiece >= n) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}
