// AC: 248 ms 
// Memory: 0 KB
// Greedy, sort
// T:O(sum(nlogn)), S:O(max(n))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1705A_Mark_the_Photographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt();
            Integer[] arr = new Integer[2 * n];
            for (int j = 0; j < 2 * n; j++) {
                int h = sc.nextInt();
                arr[j] = h;
            }
            Arrays.sort(arr);
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j + n] - arr[j] < x) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
