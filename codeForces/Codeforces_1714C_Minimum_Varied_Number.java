// AC: 202 ms 
// Memory: 0 KB
// Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1714C_Minimum_Varied_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), prevDigit = 0;
            StringBuilder ret = new StringBuilder();
            while (n > 0) {
                if (prevDigit == 0) {
                    if (n < 10) {
                        ret.append(n);
                        n = 0;
                    } else {
                        ret.append(9);
                        prevDigit = 9;
                        n -= 9;
                    }
                } else {
                    if (n < prevDigit) {
                        ret.append(n);
                        n = 0;
                    } else {
                        ret.append(prevDigit - 1);
                        prevDigit--;
                        n -= prevDigit;
                    }
                }
            }

            System.out.println(ret.reverse());
        }
    }
}
