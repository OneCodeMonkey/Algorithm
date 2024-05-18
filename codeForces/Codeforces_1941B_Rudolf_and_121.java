// AC: 640 ms 
// Memory: 1300 KB
// array implementation. For quick check, first check array sum is divided by 4.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1941B_Rudolf_and_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sumMod4 = 0;
            int[] arr = new int[n];
            boolean ret = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sumMod4 = (sumMod4 + (a % 4)) % 4;
                arr[j] = a;
            }
            if (sumMod4 != 0) {
                ret = false;
            } else {
                for (int j = 0; j < n - 2; j++) {
                    if (arr[j + 1] < arr[j] * 2 || arr[j + 2] < arr[j]) {
                        ret = false;
                        break;
                    }
                    arr[j + 1] -= 2 * arr[j];
                    arr[j + 2] -= arr[j];
                }
                if (arr[n - 2] != 0 || arr[n - 1] != 0) {
                    ret = false;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
