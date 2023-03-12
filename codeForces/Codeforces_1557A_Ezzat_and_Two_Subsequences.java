// AC: 577 ms 
// Memory: 0 KB
// Sort.
// T:O(sum(nilogni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1557A_Ezzat_and_Two_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                sum += a;
            }
            Arrays.sort(arr);
            double ret = arr[n - 1] + (sum - arr[n - 1]) * 1.0 / (n - 1);
            System.out.printf("%.9f%n", ret);
        }
    }
}
