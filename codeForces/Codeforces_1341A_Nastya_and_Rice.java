// AC: 358 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1341A_Nastya_and_Rice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (n * (a + b) < c - d || n * (a - b) > c + d) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
