// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(10^(logn)), S:O(logn)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_271A_Beautiful_Year {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        while (true) {
            if (check(++n)) {
                System.out.println(n);
                return;
            }
        }
    }

    private static boolean check(int n) {
        HashSet<Integer> digits = new HashSet<>();
        while (n > 0) {
            int digit = n % 10;
            if (digits.contains(digit)) {
                return false;
            }
            digits.add(digit);
            n /= 10;
        }

        return true;
    }
}