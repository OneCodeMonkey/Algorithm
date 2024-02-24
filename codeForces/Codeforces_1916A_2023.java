// AC: 327 ms 
// Memory: 400 KB
// math.
// T:O(sum(ni), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1916A_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            long product = 1, target = 2023;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int b = sc.nextInt();
                if (flag && !Arrays.asList(1, 7, 17, 119, 289, 2023).contains(b)) {
                    flag = false;
                }
                if (flag) {
                    product *= b;
                    if (product > target) {
                        flag = false;
                    }
                }
            }
            if (!flag || target % product != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int j = 0; j < k - 1; j++) {
                    System.out.print(1);
                    System.out.print(" ");
                }
                System.out.println(target / product);
            }
        }
    }
}
