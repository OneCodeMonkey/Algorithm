// AC: 389 ms 
// Memory: 900 KB
// DP & array.
// T:O(n), S:O(k * logk), k = 2*10^5.
//
import java.util.Scanner;

public class Codeforces_1926C_Vlad_and_a_Sum_of_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] record = new int[200_000 + 1];
        record[1] = 1;
        for (int i = 2; i < 200_001; i++) {
            record[i] = record[i - 1] + getDigitSum(i);
        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(record[n]);
        }
    }

    private static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
