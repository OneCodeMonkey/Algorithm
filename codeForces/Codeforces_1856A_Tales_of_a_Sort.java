// AC: 280 ms 
// Memory: 24700 KB
// Greedy. When adjacent pair a[i] > a[i+1], then it should be reduced by a[i].
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.Scanner;

public class Codeforces_1856A_Tales_of_a_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ret = Math.max(ret, arr[j]);
                }
            }

            System.out.println(ret);
        }
    }
}
