// AC: 359 ms 
// Memory: 1100 KB
// Math.
// T:O(sum(sqrt(ni))), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1872C_Non_coprime_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(), r = sc.nextInt(), a = -1, b = -1;
            boolean flag = false;
            if (r >= 4) {
                if (r - l > 0) {
                    flag = true;
                    int even = r % 2 == 0 ? r : r - 1;
                    a = 2;
                    b = even - a;
                } else {
                    int divider = findDivider(r);
                    if (divider != -1) {
                        flag = true;
                        a = divider;
                        b = r - a;
                    }
                }
            }
            System.out.println(flag ? (a + " " + b) : a);
        }
    }

    private static int findDivider(int n) {
        if (n <= 2) {
            return -1;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }

        return -1;
    }
}
