// AC: 265 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1850A_To_My_Critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            boolean ret = a + b >= 10 || a + c >= 10 || b + c >= 10;

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
