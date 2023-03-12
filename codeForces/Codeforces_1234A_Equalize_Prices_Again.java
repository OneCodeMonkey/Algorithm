// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1234A_Equalize_Prices_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt(), sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            int ret = (int) Math.ceil(sum * 1.0 / n);

            System.out.println(ret);
        }
    }
}
