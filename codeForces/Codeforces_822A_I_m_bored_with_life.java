// AC: 187 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_822A_I_m_bored_with_life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println(getFactorial(Math.min(n, m)));
    }

    private static long getFactorial(int n) {
        long ret = 1;
        for (int i = 2; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
