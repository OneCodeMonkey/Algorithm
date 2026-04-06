// Time: 327 ms 
// Memory: 1600 KB 
// Math: 注意到条件2，为了让所有数 & 和为0，同时又使总和最大，那么只需使得 n 个数的
// 每个二进制位（总共 k 个位），均为 （n-1）个 1 和 1 个 0，这样数组变化个数为 n^k.
// T:O(sum(ki)), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1514B_AND_0_Sum_Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            long ret = 1;
            for (int j = 0; j < k; j++) {
                ret = (long) ((ret * n) % (1e9 + 7));
            }

            System.out.println(ret);
        }
    }
}
