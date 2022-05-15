// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_466A_Cheap_Travel {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        if (m * a <= b) {
            System.out.println(n * a);
        } else {
            System.out.println((n / m) * b + Math.min((n - n / m * m) * a, b));
        }
    }
}
