// AC: 404 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0075A_Life_Without_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = a + b;
        System.out.println(removeZero(a) + removeZero(b) == removeZero(c) ? "YES" : "NO");
    }

    private static int removeZero(int num) {
        int ret = 0, base = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit > 0) {
                ret += digit * base;
                base *= 10;
            }
            num /= 10;
        }
        return ret;
    }
}
