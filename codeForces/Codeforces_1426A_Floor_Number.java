// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1426A_Floor_Number {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                System.out.println((int) Math.ceil((n - 2) * 1.0 / x) + 1);
            }
        }
    }
}
