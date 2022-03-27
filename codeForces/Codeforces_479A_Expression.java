// AC: Time: 187 ms 
// Memory: 0 KB
// whenever meet a 1, judge two side which is larger, plus it, and go on.
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_479A_Expression {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), ret = 0;
        if (a == 1) {
            ret = a + b;
            if (c == 1) {
                ret += c;
            } else {
                ret *= c;
            }
        } else {
            if (b == 1) {
                if (a >= c) {
                    ret = (b + c) * a;
                } else {
                    ret = (b + a) * c;
                }
            } else {
                if (c == 1) {
                    ret = a * (b + c);
                } else {
                    ret = a * b * c;
                }
            }
        }

        System.out.println(ret);
    }
}
