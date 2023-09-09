// AC: 233 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1728A_Colored_Balls_Revisited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), maxVal = 0, maxValIndex = -1;
            for (int j = 0; j < n; j++) {
                int cnt = sc.nextInt();
                if (cnt > maxVal) {
                    maxVal = cnt;
                    maxValIndex = j + 1;
                }
            }

            System.out.println(maxValIndex);
        }
    }
}
