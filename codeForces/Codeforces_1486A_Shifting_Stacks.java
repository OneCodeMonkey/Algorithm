// AC: 311 ms 
// Memory: 0 KB
// From the 1-index, Check the current sum is greater than or equal to i * (i - 1) / 2, if any index not, the answer is NO.
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1486A_Shifting_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long curSum = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int h = sc.nextInt();
                curSum += h;
                if (flag && curSum < (long) j * (j + 1) / 2) {
                    flag = false;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
