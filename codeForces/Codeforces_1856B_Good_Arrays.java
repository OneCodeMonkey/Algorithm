// AC: 484 ms 
// Memory: 1500 KB
// Greedy: Keep sum equal, and try to place b[i] = 1 when a[i] != 1, place b[i] != 1 when a[i] = 1.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1856B_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countOne = 0;
            long sum = 0;
            boolean ret = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    countOne++;
                }
                sum += a;
            }
            if (n == 1) {
                System.out.println("NO");
                continue;
            }
            int notOne = n - countOne;
            // 确保 原 a[i] != 1 的位置替换为 1 后，原 a[i] = 1 的位置还有剩余的和，去分配至少 >=2 的值
            if (sum - notOne - countOne >= countOne) {
                ret = true;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
