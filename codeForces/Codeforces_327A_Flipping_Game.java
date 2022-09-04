// AC: 374 ms 
// Memory: 0 KB
// DP, find max subArray that has most 0s.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_327A_Flipping_Game {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), sum = 0, minDiff = 0, prevMinDiff = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            if (i == 0) {
                prevMinDiff = a == 0 ? -1 : 0;
            } else {
                if (a == 0) {
                    prevMinDiff = Math.min(prevMinDiff - 1, -1);
                } else {
                    prevMinDiff = Math.min(prevMinDiff + 1, 0);
                }
            }
            minDiff = Math.min(minDiff, prevMinDiff);
        }

        System.out.println(minDiff == 0 ? sum - 1 : sum - minDiff);
    }
}
