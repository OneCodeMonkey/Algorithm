// Time: 358 ms 
// Memory: 300 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2149A_Be_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), countNega = 0, countZero = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a < 0) {
                    countNega++;
                } else if (a == 0) {
                    countZero++;
                }
            }
            if (countNega % 2 == 1) {
                ret += 2;
            }
            ret += countZero;

            System.out.println(ret);
        }
    }
}
