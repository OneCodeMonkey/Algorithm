// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_151A_Soft_Drinking {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(),
                nl = sc.nextInt(), np = sc.nextInt();
        System.out.println(Math.min(k * l / nl, Math.min(c * d, p / np)) / n);
    }
}
