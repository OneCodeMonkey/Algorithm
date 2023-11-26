// AC: 343 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1858A_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int firstChooseC = c % 2 == 1 ? c / 2 + 1 : c / 2;

            System.out.println((firstChooseC + a > c / 2 + b) ? "First" : "Second");
        }
    }
}
