// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1669A_Division {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), ret;
            if (a <= 1399) {
                ret = 4;
            } else if (a <= 1599) {
                ret = 3;
            } else if (a <= 1899) {
                ret = 2;
            } else {
                ret = 1;
            }
            System.out.println("Division " + ret);
        }
    }
}
