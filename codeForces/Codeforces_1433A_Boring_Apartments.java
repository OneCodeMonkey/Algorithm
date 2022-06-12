// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(t * log10(n)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1433A_Boring_Apartments {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), digit = x % 10, extra = 0, counter = 1;
            while (x > 0) {
                extra += counter;
                counter++;
                x /= 10;
            }
            System.out.println((digit - 1) * 10 + extra);
        }
    }
}
