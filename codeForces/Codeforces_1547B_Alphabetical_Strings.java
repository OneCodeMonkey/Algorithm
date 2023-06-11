// AC: 265 ms 
// Memory: 100 KB
// Check from two endpoints of the string
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1547B_Alphabetical_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int n = s.length(), leftPos = 0, rightPos = n - 1;
            char endChar = (char) ('a' + (n - 1));
            boolean flag = true;
            while (leftPos <= rightPos) {
                if (s.charAt(leftPos) == endChar) {
                    leftPos++;
                } else if (s.charAt(rightPos) == endChar) {
                    rightPos--;
                } else {
                    flag = false;
                    break;
                }

                endChar = (char) (endChar - 1);
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
