// Time: 265 ms 
// Memory: 1000 KB
// brute-force.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2060A_Fibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt(), a2 = sc.nextInt(), a4 = sc.nextInt(), a5 = sc.nextInt(), ret = 1;
            int[] arr = new int[]{a1 + a2, a4 - a2, a5 - a4};
            for (int j : arr) {
                int tmp = 0;
                if (a1 + a2 == j) {
                    tmp++;
                }
                if (a2 + j == a4) {
                    tmp++;
                }
                if (j + a4 == a5) {
                    tmp++;
                }
                ret = Math.max(ret, tmp);
                if (ret == 3) {
                    break;
                }
            }
            System.out.println(ret);
        }
    }
}
