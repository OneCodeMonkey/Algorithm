// AC: 390 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1409A_Yet_Another_Two_Integers_Problem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println((int) Math.ceil(Math.abs(a - b) * 1.0 / 10));
        }
    }
}
