// AC: 203 ms 
// Memory: 800 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2008A_Sakurako_s_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            boolean ret;
            if (a % 2 == 0 && b % 2 == 0) {
                ret = true;
            } else if (a % 2 == 0 && b % 2 == 1) {
                ret = a >= 2;
            } else if (a % 2 == 1 && b % 2 == 1) {
                ret = false;
            } else {
                ret = false;
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
