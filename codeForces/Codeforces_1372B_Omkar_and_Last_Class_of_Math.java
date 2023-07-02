// AC: 187 ms 
// Memory: 0 KB
// Math: find the largest divider k of n, then the answer will be [(n - k), n]
// T:O(sum(sqrt(ni) / 2)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1372B_Omkar_and_Last_Class_of_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n % 2 == 0) {
                ret = n / 2;
            } else {
                // find Largest divider
                int sqrtN = (int) Math.sqrt(n), start = sqrtN % 2 == 1 ? sqrtN : sqrtN - 1, largestDivider = 1;
                for (int j = start; j > 1; j -= 2) {
                    if (n % j == 0) {
                        largestDivider = j;
                        break;
                    }
                }
                if (largestDivider != 1 && largestDivider * largestDivider != n) {
                    for (int j = 3; j < start; j++) {
                        if (n % j == 0) {
                            largestDivider = Math.max(largestDivider, n / j);
                            break;
                        }
                    }
                }

                ret = n - largestDivider;
            }

            System.out.println((n - ret) + " " + ret);
        }
    }
}
