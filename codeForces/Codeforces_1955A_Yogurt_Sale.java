// AC: 249 ms 
// Memory: 900 KB
// greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1955A_Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), ret = 0;
            if (2 * a <= b) {
                ret = n * a;
            } else {
                ret = (n / 2) * b + (n % 2) * a;
            }
            System.out.println(ret);
        }
    }
}
