// Time: 499 ms 
// Memory: 1400 KB
// 只有0，1，2 三种答案，如果有正整数区间内包含0的子数组，答案就是2次。
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1696B_NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int firstPosiIndex = -1, lastPosiIndex = -1, zeroIndex = -1;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a > 0) {
                    if (firstPosiIndex == -1) {
                        firstPosiIndex = j;
                        if (j == n - 1) {
                            lastPosiIndex = j;
                        }
                    } else {
                        lastPosiIndex = Math.max(lastPosiIndex, j);
                    }
                } else {
                    if (firstPosiIndex != -1 && zeroIndex == -1) {
                        zeroIndex = j;
                    }
                }
            }

            if (firstPosiIndex == -1) {
                ret = 0;
            } else if (firstPosiIndex == lastPosiIndex || zeroIndex == -1 || zeroIndex > lastPosiIndex) {
                ret = 1;
            } else {
                ret = 2;
            }

            System.out.println(ret);
        }
    }
}
