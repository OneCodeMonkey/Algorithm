// AC: 218 ms 
// Memory: 0 KB
// .
// T:(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1296A_Array_with_Odd_Sum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sum = 0, oddCount = 0, evenCount = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (oddCount == 0 && a % 2 == 1) {
                    oddCount = 1;
                }
                if (evenCount == 0 && a % 2 == 0) {
                    evenCount = 1;
                }
                sum += a;
            }

            if (sum % 2 == 1 || (oddCount == 1 && evenCount == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
