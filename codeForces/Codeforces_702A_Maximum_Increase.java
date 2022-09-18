// AC: 295 ms 
// Memory: 0 KB
// .
// T:O(n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_702A_Maximum_Increase {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), prev = 0, increaseCount = 0, ret = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > prev) {
                increaseCount++;
                ret = Math.max(ret, increaseCount);
            } else {
                increaseCount = 1;
            }
            prev = a;
        }
        System.out.println(ret);
    }
}
