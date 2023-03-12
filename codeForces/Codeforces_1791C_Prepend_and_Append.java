// AC: 187 ms 
// Memory: 0 KB
// Two pointer.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1791C_Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), leftPos = 0, rightPos = n - 1, ret = 0;
            String s = sc.next();
            while (leftPos < rightPos) {
                if ((s.charAt(leftPos) == '0' && s.charAt(rightPos) == '1') ||
                        (s.charAt(leftPos) == '1' && s.charAt(rightPos) == '0')) {
                    leftPos++;
                    rightPos--;
                } else {
                    break;
                }
            }

            if (leftPos == rightPos) {
                ret = 1;
            } else if (leftPos > rightPos) {
                ret = 0;
            } else {
                ret = n - 2 * leftPos;
            }
            System.out.println(ret);
        }
    }
}
