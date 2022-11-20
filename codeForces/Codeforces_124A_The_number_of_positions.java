// Time: 374 ms 
// Memory: 0 KB
// brute-force
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_124A_The_number_of_positions {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), ret = 0;
        for (int i = 1; i <= n; i++) {
            if (n - i >= a && i - 1 <= b) {
                ret++;
            }
        }

        System.out.println(ret);
    }
}
