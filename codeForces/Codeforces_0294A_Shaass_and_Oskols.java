// AC: 686 ms 
// Memory: 1200 KB
// Implementation.
// T:O(n + m), S:O(n)
//
import java.util.Scanner;

public class Codeforces_0294A_Shaass_and_Oskols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            int left = y - 1, right = arr[x - 1] - y;
            if (x > 1) {
                arr[x - 2] += left;
            }
            if (x < n) {
                arr[x] += right;
            }
            arr[x - 1] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
