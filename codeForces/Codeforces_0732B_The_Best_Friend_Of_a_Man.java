// Time: 358 ms 
// Memory: 600 KB
// dp | constructive
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_0732B_The_Best_Friend_Of_a_Man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), prev = -1, ret = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i == 0) {
                prev = a;
                arr[i] = a;
                continue;
            }
            if (a + prev < k) {
                ret += k - a - prev;
                arr[i] = k - prev;
            } else {
                arr[i] = a;
            }
            prev = arr[i];
        }

        System.out.println(ret);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
