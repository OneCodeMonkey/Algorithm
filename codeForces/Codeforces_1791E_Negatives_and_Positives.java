// AC: 702 ms 
// Memory: 1700 KB
// Greedy: We can pass the negative sign in the array by operation some times,
// If has zero, we can make all elements be positive. Or has even negative numbers, can make all elements be positive.
// If has odd negative numbers, try to make the minimal absolute value number to be -, others be positive, then can the answer.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1791E_Negatives_and_Positives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), negaCount = 0, minAbs = Integer.MAX_VALUE;
            long sum = 0;
            boolean hasZero = false;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sum += Math.abs(a);
                if (hasZero) {
                    continue;
                }
                if (a == 0) {
                    hasZero = true;
                    continue;
                }
                if (a < 0) {
                    negaCount++;
                }
                minAbs = Math.min(minAbs, Math.abs(a));
            }

            if (hasZero || negaCount % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 2L * minAbs);
            }
        }
    }
}
