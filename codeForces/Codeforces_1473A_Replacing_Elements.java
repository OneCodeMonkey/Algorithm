// AC: 530 ms 
// Memory: 0 KB
// greedy
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1473A_Replacing_Elements {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), d = sc.nextInt(), pos = 0, maxVal = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxVal = Math.max(maxVal, a);
                arr[pos++] = a;
            }

            if (maxVal <= d) {
                System.out.println("YES");
            } else {
                Arrays.sort(arr);
                System.out.println(arr[0] + arr[1] <= d ? "YES" : "NO");
            }
        }
    }
}
