// AC: 342 ms 
// Memory: 400 KB
// All bricks place horizontally, if m % 2, let (m / 2 - 1) be 1✖️2，the last be 1✖️3.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1918A_Brick_Wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            System.out.println(n * (m / 2));
        }
    }
}
