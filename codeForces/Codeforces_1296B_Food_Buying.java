// AC: 343 ms 
// Memory: 0 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1296B_Food_Buying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            while (n > 0) {
                if (n < 10) {
                    ret += n;
                    break;
                }
                int back = n / 10, cost = back * 10;
                ret += cost;
                n -= cost;
                n += back;
            }

            System.out.println(ret);
        }
    }
}
