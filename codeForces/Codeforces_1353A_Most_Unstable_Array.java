// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1353A_Most_Unstable_Array {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(m);
            } else {
                System.out.println(m * 2);
            }
        }
    }
}
