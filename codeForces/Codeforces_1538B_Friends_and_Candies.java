// AC: 389 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1538B_Friends_and_Candies {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                sum += a;
            }
            if (sum % n != 0) {
                System.out.println(-1);
            } else {
                int ret = 0;
                for (int item : arr) {
                    if (item * n > sum) {
                        ret++;
                    }
                }
                System.out.println(ret);
            }
        }
    }
}
