// Time: 327 ms 
// Memory: 0 KB
// Try every number to make a Arithmetic Progression.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1624B_Make_AP {
    private final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int a = SC.nextInt(), b = SC.nextInt(), c = SC.nextInt();
            int num1 = 2 * b - a, num2 = 2 * b - c, num3 = a + c;
            if ((num1 > 0 && num1 % c == 0) || (num2 > 0 && num2 % a == 0) ||
                    (num3 > 0 && num3 % 2 == 0 && (num3 / 2) % b == 0)) {
                System.out.println("YES");

            } else {
                System.out.println("NO");

            }
        }
    }
}
