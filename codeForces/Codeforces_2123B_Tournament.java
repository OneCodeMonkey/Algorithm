// Time: 655 ms 
// Memory: 1400 KB
// 可以任意两两比，直至只剩 k 个而 arr[j] 一直不参与。只有一种情况输：k=1 且 arr[j] 不是最大。
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2123B_Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt(), maxVal = -1, indexJ = -1;
            for (int r = 0; r < n; r++) {
                int a = sc.nextInt();
                if (r == j - 1) {
                    indexJ = a;
                }
                maxVal = Math.max(maxVal, a);
            }
            boolean ret = k != 1 || maxVal == indexJ;

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
