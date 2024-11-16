// AC: 311 ms 
// Memory: 800 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1877A_Goals_of_Victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0;
            for (int j = 0; j < n - 1; j++) {
                sum += sc.nextInt();
            }
            System.out.println(-sum);
        }
    }
}
