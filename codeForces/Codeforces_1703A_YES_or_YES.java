// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1703A_YES_or_YES {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            if ("YES".equalsIgnoreCase(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
