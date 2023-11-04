// AC: 202 ms 
// Memory: 0 KB
// Backtracking | bitmask traversal
// T:O(2 ^ n * n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1097B_Petr_and_a_Combination_Lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int time = (int) Math.pow(2, n) - 1;
        for (int i = 0; i <= time; i++) {
            int degree = 0, base = 1;
            for (int j = 0; j < n; j++) {
                int bit = i & (base << j);
                degree += bit == 0 ? arr[j] : -arr[j];
            }
            if (degree == 0 || degree % 360 == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
