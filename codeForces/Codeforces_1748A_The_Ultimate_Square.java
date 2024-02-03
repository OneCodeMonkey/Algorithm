// AC: 342 ms 
// Memory: 500 KB
// It can be proved that when n is odd, the sum is always a square number, so the maximum side length is Math.ceil(n / 2).
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1748A_The_Ultimate_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? n / 2 : (n / 2 + 1));
        }
    }
}
