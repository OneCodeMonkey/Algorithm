// AC: 312 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1475B_New_Year_s_Number {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), count1 = n / 2020, count2 = n - count1 * 2020;
            System.out.println(count2 <= count1 ? "YES" : "NO");
        }
    }
}
