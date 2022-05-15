// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_750A_New_Year_and_Hurry {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int sqrtN = (int) Math.sqrt((240 - k) * 2.0 / 5);
        if (sqrtN * (sqrtN + 1) / 2 * 5 > 240 - k) {
            sqrtN--;
        }
        System.out.println(Math.min(n, sqrtN));
    }
}
