// Time: 296 ms 
// Memory: 500 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2106A_Dr_TC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), count1 = 0, count0 = 0, ret = 0;
            String s = sc.next();
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    count1++;
                } else {
                    count0++;
                }
            }
            ret = count1 * (n - 1) + count0;

            System.out.println(ret);
        }
    }
}
