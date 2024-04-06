// AC: 359 ms 
// Memory: 1500 KB
// Constructive: if n is odd, then [1,(n-1)/2, (n-1)/2], otherwise if (n/2) is odd, then [2, (n-2)/2, (n-2)/2], 
// otherwise [n/4, n/4, n/2].
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1497C1_k_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), a1, a2, a3;
            if (n % 2 == 1) {
                a1 = 1;
                a2 = (n - 1) / 2;
                a3 = a2;
            } else {
                if ((n / 2) % 2 == 1) {
                    a1 = 2;
                    a2 = (n - 2) / 2;
                    a3 = a2;
                } else {
                    a3 = n / 2;
                    a2 = a3 / 2;
                    a1 = a2;
                }
            }

            System.out.println(a1 + " " + a2 + " " + a3);
        }
    }
}
