// AC: 202 ms 
// Memory: 24600 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_758A_Holiday_Of_Equality {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), sum = 0, maxN = -1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            maxN = Math.max(maxN, t);
            sum += t;
        }
        System.out.println(maxN * n - sum);
    }
}
