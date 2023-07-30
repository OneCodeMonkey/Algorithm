// AC: 638 ms 
// Memory: 300 KB
// Sort & constructive
// T:O(sum(nlogn)), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1783A_Make_it_Beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                max = Math.max(max, a);
                min = Math.min(min, a);
            }
            if (max == min) {
                System.out.println("NO");
            } else {
                Arrays.sort(arr);
                System.out.println("YES");
                System.out.print(max + " " + min);
                for (int j = n - 2; j >= 1; j--) {
                    System.out.print(" " + arr[j]);
                }
                System.out.println();
            }
        }
    }
}
