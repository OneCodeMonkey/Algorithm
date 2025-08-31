// Time: 217 ms 
// Memory: 800 KB
// Greedy & sort.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_2121A_Letter_Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), s = sc.nextInt(), ret = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            Arrays.sort(arr);
            if (s <= arr[0]) {
                ret = arr[n - 1] - s;
            } else if (s >= arr[n - 1]) {
                ret = s - arr[0];
            } else {
                ret = Math.min(s - arr[0], arr[n - 1] - s) + arr[n - 1] - arr[0];
            }

            System.out.println(ret);
        }
    }
}
