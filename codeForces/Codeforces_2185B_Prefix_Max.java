// Time: 250 ms 
// Memory: 1000 KB
// Greedy.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2185B_Prefix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), maxVal = 0;
            for (int j = 0; j < n; j++) {
                maxVal = Math.max(maxVal, sc.nextInt());
            }

            System.out.println(maxVal * n);
        }
    }
}
