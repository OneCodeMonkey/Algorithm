// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0439A_Devu_the_Singer_and_Churu_the_Joker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(), sum = 0, ret = -1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            sum += t;
        }
        if ((n - 1) * 10 + sum <= d) {
            ret = 2 * (n - 1);
            ret += (d - (n - 1) * 10 - sum) / 5;
        }
        System.out.println(ret);
    }
}
