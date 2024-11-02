// AC: 2359 ms 
// Memory: 1600 KB
// 反向思维，不记录原始 arr[n]，而只记录 a 的值去重，以 a 值 1～1000 去便利。
// T:O(t * k^2), S:O(k), k =1000
// 
import java.util.Scanner;

public class Codeforces_1742D_Coprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = -1;
            int[] numPos = new int[1001];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                numPos[a] = j + 1;
            }
            for (int j = 1; j <= 1000; j++) {
                for (int k = j; k <= 1000; k++) {
                    if (numPos[j] > 0 && numPos[k] > 0 && gcd(j, k) == 1) {
                        ret = Math.max(ret, numPos[j] + numPos[k]);
                    }
                }
            }

            System.out.println(ret);
        }
    }

    private static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        String key = a + "#" + b;
        if (b % a == 0) {
            return a;
        } else {
            return gcd(b % a, a);
        }
    }
}
