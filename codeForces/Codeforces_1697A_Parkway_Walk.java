// AC: 202 ms 
// Memory: 0 KB 
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1697A_Parkway_Walk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sum += a;
            }
            System.out.println(sum <= m ? 0 : sum - m);
        }
    }
}
