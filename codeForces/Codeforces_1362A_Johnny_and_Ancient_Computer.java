// AC: 296 ms 
// Memory: 1100 KB
// .
// T:O(sum(logni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1362A_Johnny_and_Ancient_Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ret = -1;
            long a = sc.nextLong(), b = sc.nextLong();
            if (a == b) {
                ret = 0;
            } else {
                long minVal = Math.min(a, b), maxVal = Math.max(a, b);
                if (maxVal % minVal == 0) {
                    long divider = maxVal / minVal, expFor2 = 0;
                    boolean flag = true;
                    while (divider > 1) {
                        if (divider % 2 != 0) {
                            flag = false;
                            break;
                        }
                        divider /= 2;
                        expFor2++;
                    }
                    if (!flag) {
                        ret = -1;
                    } else {
                        ret = (int) Math.ceil(expFor2 * 1.0 / 3);
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
