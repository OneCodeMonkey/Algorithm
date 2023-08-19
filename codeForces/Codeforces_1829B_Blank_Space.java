// AC: 280 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1829B_Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), continouZeroCount = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 0) {
                    continouZeroCount++;
                    ret = Math.max(ret, continouZeroCount);
                } else {
                    continouZeroCount = 0;
                }
            }
            System.out.println(ret);
        }
    }
}
