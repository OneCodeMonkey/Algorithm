// Time: 311 ms 
// Memory: 1200 KB
// .
// T:O(sum(ki)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2137A_Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            long ret = sc.nextInt();
            for (int j = 0; j < k; j++) {
                if (ret % 2 == 1) {
                    ret *= 2;
                } else if ((ret - 1) % 3 == 0) {
                    ret = (ret - 1) / 3;
                } else {
                    ret *= 2;
                }
            }

            System.out.println(ret);
        }
    }
}
