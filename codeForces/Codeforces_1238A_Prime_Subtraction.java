// AC: 343 ms 
// Memory: 1000 KB
// Math.
// T:O(t), S:O(1)
//
import java.util.Scanner;

public class Codeforces_1238A_Prime_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong(), y = sc.nextLong();

            System.out.println(x - y >= 2 ? "YES" : "NO");
        }
    }
}
