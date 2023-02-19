// AC: 1793 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1760C_Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), max = 0, second = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int s = sc.nextInt();
                arr[j] = s;
                if (s >= max) {
                    second = max;
                    max = s;
                } else if (s > second) {
                    second = s;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] == max ? max - second : arr[j] - max);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
