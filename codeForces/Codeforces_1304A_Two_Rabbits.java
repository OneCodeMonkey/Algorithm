// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1304A_Two_Rabbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

            System.out.println((y - x) % (a + b) == 0 ? (y - x) / (a + b) : -1);
        }
    }
}
