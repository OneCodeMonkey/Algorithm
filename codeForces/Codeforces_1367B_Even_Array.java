// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1367B_Even_Array {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), oddCount = 0, evenCount = 0, oddIndexErrorCount = 0, evenIndexErrorCount = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    evenCount++;
                    if (j % 2 == 1) {
                        oddIndexErrorCount++;
                    }
                } else {
                    oddCount++;
                    if (j % 2 == 0) {
                        evenIndexErrorCount++;
                    }
                }
            }
            System.out.println(oddCount == n / 2 ? Math.min(oddIndexErrorCount, evenIndexErrorCount) : -1);
        }
    }
}
