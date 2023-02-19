// AC: 249 ms 
// Memory: 0 KB
// If exist, then s * m = t * n, m and n are relatively primes, and m : n = t.length() : s.length().
// We find such m and n, and check m * s and t * n strings are equal or not.
// T:O(q * k), S:O(k), k is string's length.
// 
import java.util.Scanner;

public class Codeforces_1473B_String_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String s = sc.next(), t = sc.next();
            int len1 = s.length(), len2 = t.length(), lcd = LCD(len1, len2);
            String s1 = s.repeat(len2 / lcd), t1 = t.repeat(len1 / lcd);

            System.out.println(s1.equals(t1) ? s1 : -1);
        }
    }

    private static int LCD(int a, int b) {
        if (a > b) {
            return LCD(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return LCD(b % a, a);
    }
}
