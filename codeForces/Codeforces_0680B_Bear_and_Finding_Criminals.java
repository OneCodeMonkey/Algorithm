// AC: 312 ms 
// Memory: 1400 KB
// .
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_0680B_Bear_and_Finding_Criminals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), ret = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        ret += arr[a - 1] == 1 ? 1 : 0;
        for (int i = 1; i <= n - 1; i++) {
            int left = (a - 1 - i) >= 0 ? arr[a - 1 - i] : -1, right = (a - 1 + i) < n ? arr[a - 1 + i] : -1;
            if (left == -1 && right == -1) {
                break;
            } else if (left == -1) {
                ret += right;
            } else if (right == -1) {
                ret += left;
            } else {
                ret += left == 1 && right == 1 ? 2 : 0;
            }
        }

        System.out.println(ret);
    }
}
