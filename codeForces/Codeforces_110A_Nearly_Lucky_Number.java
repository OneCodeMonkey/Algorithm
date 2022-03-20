// AC: Time: 466 ms 
// Memory: 0 KB
// .
// T:(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_110A_Nearly_Lucky_Number {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        int count = 0;
        while (n > 0) {
            long digit = n % 10;
            if (digit == 4 || digit == 7) {
                count++;
            }
            n /= 10;
        }

        System.out.println((count == 4 || count == 7) ? "YES" : "NO");
    }
}
