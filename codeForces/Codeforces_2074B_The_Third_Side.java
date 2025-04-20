// Time: 514 ms 
// Memory: 1100 KB
// Geometry & Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2074B_The_Third_Side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sum += a;
            }

            System.out.println(sum - (n - 1));
        }
    }
}
