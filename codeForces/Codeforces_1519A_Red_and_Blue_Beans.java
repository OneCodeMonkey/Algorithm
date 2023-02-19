// AC: 249 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1519A_Red_and_Blue_Beans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
            int minVal = Math.min(r, b), maxVal = Math.max(r, b), diff = maxVal - minVal;

            System.out.println((long) minVal * d >= diff ? "YES" : "NO");
        }
    }
}
