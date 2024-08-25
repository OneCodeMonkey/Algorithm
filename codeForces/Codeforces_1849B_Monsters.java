// AC: 1062 ms 
// Memory: 15300 KB
// Mod & Sort.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1849B_Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = new int[]{j + 1, a % k == 0 ? k : a % k};
            }
            StringBuilder ret = new StringBuilder();

            Arrays.sort(arr, (a, b) -> b[1] - a[1]);
            for (int j = 0; j < n; j++) {
                ret.append(arr[j][0]);
                if (j != n - 1) {
                    ret.append(" ");
                }
            }

            System.out.println(ret);
        }
    }
}
