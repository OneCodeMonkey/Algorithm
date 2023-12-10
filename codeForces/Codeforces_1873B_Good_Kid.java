// AC: 327 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1873B_Good_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE, product = 1, zeroCount = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 0) {
                    zeroCount++;
                } else {
                    product *= a;
                    minVal = Math.min(minVal, a);
                }
            }
            if (zeroCount == 1) {
                ret = product;
            } else if (zeroCount == 0) {
                ret = product / minVal * (minVal + 1);
            }
            System.out.println(ret);
        }
    }
}
