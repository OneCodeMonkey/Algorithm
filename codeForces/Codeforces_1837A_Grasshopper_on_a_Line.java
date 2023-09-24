// AC: 233 ms 
// Memory: 0 KB
// Constructive.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1837A_Grasshopper_on_a_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), k = sc.nextInt();
            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                System.out.println((x - 1) + " 1");
            }
        }
    }
}
