// AC: 372 ms 
// Memory: 0 KB
// GCD.
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0119A_Epic_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(), round = 0;
        while (n > 0) {
            if (round % 2 == 0) {
                n -= getGCD(a, n);
            } else {
                n -= getGCD(b, n);
            }
            if (n == 0) {
                break;
            }
            round++;
        }
        System.out.println(round % 2 == 0 ? 0 : 1);
    }

    private static int getGCD(int a, int b) {
        if (a > b) {
            return getGCD(b, a);
        }
        if (a == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        } else {
            return getGCD(b % a, a);
        }
    }
}
