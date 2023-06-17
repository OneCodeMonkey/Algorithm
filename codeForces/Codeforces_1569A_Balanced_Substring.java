// AC: 265 ms 
// Memory: 0 KB
// Just find substring like "ab","ba"
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1569A_Balanced_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), leftPos = -1, rightPos = -1;
            String s = sc.next();
            if (n > 1) {
                for (int j = 1; j < n; j++) {
                    if ((s.charAt(j) == 'a' && s.charAt(j - 1) == 'b') ||
                            (s.charAt(j) == 'b' && s.charAt(j - 1) == 'a')) {
                        leftPos = j;
                        rightPos = j + 1;
                        break;
                    }
                }
            }
            System.out.println(leftPos + " " + rightPos);
        }
    }
}
