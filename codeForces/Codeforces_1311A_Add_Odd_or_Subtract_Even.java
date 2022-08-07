// AC: 295 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1311A_Add_Odd_or_Subtract_Even {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == b) {
                System.out.println(0);
            } else if (a < b) {
                if ((b - a) % 2 == 1) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                if ((a - b) % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
