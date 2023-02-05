// AC: 436 ms 
// Memory: 0 KB
// Math, greedy
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1409B_Minimum_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            long ret = 0;
            if (a - x + b - y <= n) {
                ret = (long) x * y;
            } else {
                if (a >= b) {
                    if (b - y >= n) {
                        ret = (long) a * (b - n);
                    } else {
                        long val1 = (long) (a - (n - b + y)) * y, val2 = 0;
                        if (a - x >= n) {
                            val2 = (long) (a - n) * b;
                        } else {
                            val2 = (long) x * (b - (n - a + x));
                        }

                        ret = Math.min(val1, val2);
                    }
                } else {
                    if (a - x >= n) {
                        ret = (long) (a - n) * b;
                    } else {
                        long val1 = (long) (b - (n - a + x)) * x, val2 = 0;
                        if (b - y >= n) {
                            val2 = (long) (b - n) * a;
                        } else {
                            val2 = (long) y * (a - (n - b + y));
                        }

                        ret = Math.min(val1, val2);
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
