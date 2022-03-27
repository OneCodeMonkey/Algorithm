// AC: Time: 374 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_133A_HQ9plus {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        for (char c : str.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
