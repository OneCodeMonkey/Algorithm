// Time: 249 ms
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2030A_A_Gift_From_Orangutan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minVal = Math.min(minVal, a);
                maxVal = Math.max(maxVal, a);
            }
            System.out.println((n - 1) * (maxVal - minVal));
        }
    }
}
