// AC: 249 ms 
// Memory: 1100 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1999A_plus_B_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n / 10 + n % 10);
        }
    }
}
