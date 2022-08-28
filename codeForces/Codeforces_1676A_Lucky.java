// AC: 202 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1676A_Lucky {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            int i1 = str.charAt(0) - '0', i2 = str.charAt(1) - '0', i3 = str.charAt(2) - '0', i4 = str.charAt(3) - '0',
                    i5 = str.charAt(4) - '0', i6 = str.charAt(5) - '0';
            System.out.println((i1 + i2 + i3 == i4 + i5 + i6) ? "YES" : "NO");
        }
    }
}
