// AC: 515 ms 
// Memory: 1400 KB
// Sort: Only when array is strictly decreasing, the needed swap times are n*(n-1)/2. 
// So just check if it's not strictly decreasing.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1420A_Cubes_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prev = -1;
            boolean isStrictDecr = true;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (isStrictDecr && prev != -1) {
                    if (a >= prev) {
                        isStrictDecr = false;
                    }
                }
                prev = a;
            }

            System.out.println(!isStrictDecr ? "YES" : "NO");
        }
    }
}
