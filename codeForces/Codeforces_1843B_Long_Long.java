// AC: 608 ms 
// Memory: 0 KB
// Check number of continous negative sequences(can include 0).
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1843B_Long_Long {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), maxOper = 0, prevNonZero = 0;
            long maxSum = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                maxSum += Math.abs(a);
                if (prevNonZero < 0) {
                    if (a > 0) {
                        prevNonZero = a;
                    }
                } else {
                    if (a < 0) {
                        maxOper++;
                        prevNonZero = a;
                    } else if (a > 0) {
                        prevNonZero = a;
                    }
                }
            }

            System.out.println(maxSum + " " + maxOper);
        }
    }
}
