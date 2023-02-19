// AC: 218 ms 
// Memory: 0 KB
// It can be proved that result is between Math.min(a, b) and (a + b) / 3 in the end.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1366A_Shovels_and_Swords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int minVal = Math.min(a, b);

            System.out.println(Math.min(minVal, (a + b) / 3));
        }
    }
}
