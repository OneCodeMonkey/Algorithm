// AC: 685 ms 
// Memory: 600 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1931B_Make_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = 0, remain = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            boolean flag = true;
            long avg = sum / n;
            for (int j = 0; j < n; j++) {
                if (arr[j] + remain < avg) {
                    flag = false;
                    break;
                }
                remain = arr[j] + remain - avg;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
