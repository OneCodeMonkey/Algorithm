// AC: 374 ms 
// Memory: 0 KB
// Brute-force.
// T:O(logn), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_214A_System_of_Equations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), aMax = (int) Math.sqrt(n), bMax = (int) Math.sqrt(m), ret = 0;
        for (int i = 0; i <= aMax; i++) {
            for (int j = 0; j <= bMax; j++) {
                if (i * i + j == n && j * j + i == m) {
                    ret++;
                }
            }
        }

        System.out.println(ret);
    }
}
