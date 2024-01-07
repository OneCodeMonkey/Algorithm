// AC: 217 ms 
// Memory: 0 KB
// Math: 等差数列.
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1180A_Alex_and_a_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1 + 4 * n * (n - 1) / 2);
    }
}
