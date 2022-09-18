// AC: 280 ms 
// Memory: 0 KB
// Thought: if a==0, we can not get 1, if a != 0, we can combine from 1 to (a + 2*b).
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1660A_Vasya_and_Coins {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a != 0) {
                System.out.println(a + 2 * b + 1);
            } else {
                System.out.println(1);
            }
        }
    }
}
