// AC: 233 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1631A_Min_Max_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), max1 = 0, max2 = 0;
            int[] arrayA = new int[n], arrayB = new int[n];
            for (int j = 0; j < n; j++) {
                arrayA[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arrayB[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                max1 = Math.max(max1, Math.min(arrayA[j], arrayB[j]));
                max2 = Math.max(max2, Math.max(arrayA[j], arrayB[j]));
            }

            System.out.println(max1 * max2);
        }
    }
}
