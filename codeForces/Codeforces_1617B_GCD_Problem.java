// AC: 702 ms 
// Memory: 1500 KB
// Math. when n is evem, you can find (1, n/2-1, n/2). when n is odd, try to find coprime pair which sum to n-1.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1617B_GCD_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = 0, b = 0, c = 1;
            if (n % 2 == 0) {
                a = n / 2 - 1;
                b = n / 2;
            } else {
                for (int j = n / 2; j >= 2; j--) {
                    if (gcd(j, n - 1 - j) == 1) {
                        a = n - 1 - j;
                        b = j;
                        break;
                    }
                }
            }

            System.out.println(a + " " + b + " " + c);
        }
    }

    private static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        } else {
            return gcd(b % a, a);
        }
    }
}
