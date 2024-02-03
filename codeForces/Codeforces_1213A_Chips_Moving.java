// AC: 296 ms 
// Memory: 600 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1213A_Chips_Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), oddCount = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 1) {
                oddCount++;
            }
        }
        System.out.println(Math.min(oddCount, n - oddCount));
    }
}
