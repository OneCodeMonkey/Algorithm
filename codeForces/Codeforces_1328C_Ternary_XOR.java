// AC: 373 ms 
// Memory: 0 KB
// If the digit is even, then put one to both, if the digit meets odd, then put one with 1, the other with 0, after that put all digit to the one with 0.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1328C_Ternary_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String x = sc.next();
            StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
            boolean hasDiff = false;
            for (int j = 0; j < n; j++) {
                Integer digit = Integer.parseInt(String.valueOf(x.charAt(j)));
                if (hasDiff) {
                    s1.append(0);
                    s2.append(digit);
                } else {
                    if (digit % 2 == 0) {
                        s1.append(digit / 2);
                        s2.append(digit / 2);
                    } else {
                        s1.append(1);
                        s2.append(0);
                        hasDiff = true;
                    }
                }
            }
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
