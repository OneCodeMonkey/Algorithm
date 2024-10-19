// AC: 296 ms 
// Memory: 600 KB
// Simutation.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1999B_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt(), a2 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt(), ret = 0;
            if (a1 > b1 && a2 >= b2) {
                ret += 2;
            }
            if (a1 > b2 && a2 >= b1) {
                ret += 2;
            }
            if (a1 == b1 && a2 > b2) {
                ret += 2;
            }
            if (a1 == b2 && a2 > b1) {
                ret += 2;
            }

            System.out.println(ret);
        }
    }
}
