// AC: 468 ms 
// Memory: 0 KB
// Sort & put it in sequence like a[0], a[n], a[1], a[n+1], ... , a[n-1], a[2n-1]
// T:O(sum(ni logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1526A_Mean_Inequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[2 * n];
            for (int j = 0; j < 2 * n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " " + arr[j + n]);
                if (j != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
