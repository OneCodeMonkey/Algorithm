// AC: 249 ms 
// Memory: 1200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1985A_Creating_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next(), b = sc.next();

            System.out.println(b.charAt(0) + a.substring(1, 3) + " " + a.charAt(0) + b.substring(1, 3));
        }
    }
}
