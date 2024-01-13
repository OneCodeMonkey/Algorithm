// AC: 389 ms 
// Memory: 0 KB
// Discuss by situations.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1613A_Long_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt(), p1 = sc.nextInt(), x2 = sc.nextInt(), p2 = sc.nextInt(), ret = 0;
            if (x1 != x2 || p1 != p2) {
                int digit1 = getDigit(x1), digit2 = getDigit(x2);
                if (digit1 + p1 > digit2 + p2) {
                    ret = 1;
                } else if (digit1 + p1 < digit2 + p2) {
                    ret = -1;
                } else {
                    if (p1 == p2) {
                        ret = Integer.compare(x1, x2);
                    } else {
                        if (digit1 > digit2) {
                            x2 *= Math.pow(10, digit1 - digit2);
                        } else {
                            x1 *= Math.pow(10, digit2 - digit1);
                        }
                        ret = Integer.compare(x1, x2);
                    }
                }
            }
            System.out.println(ret == 0 ? "=" : (ret == 1 ? ">" : "<"));
        }
    }

    private static int getDigit(int num) {
        int digit = 1;
        while (num >= 10) {
            digit++;
            num /= 10;
        }

        return digit;
    }
}
