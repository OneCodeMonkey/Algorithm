// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1807B_Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sumEven = 0, sumOdd = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    sumEven += a;
                } else {
                    sumOdd += a;
                }
            }
            System.out.println(sumEven > sumOdd ? "YES" : "NO");
        }
    }
}
