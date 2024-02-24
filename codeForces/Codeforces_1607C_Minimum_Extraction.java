// AC: 717 ms 
// Memory: 600 KB
// Sort. compare the arr[0] and arr[j] - arr[j-1] (1<= j <= n-1).
// T:O(sum(ni logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1607C_Minimum_Extraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = Integer.MIN_VALUE, prev = Integer.MIN_VALUE;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            ret = arr[0];
            for (int j = 1; j < n; j++) {
                ret = Math.max(ret, arr[j] - arr[j - 1]);
            }

            System.out.println(ret);
        }
    }
}
