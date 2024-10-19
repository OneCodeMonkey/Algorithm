// AC: 280 ms 
// Memory: 900 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2000A_Primary_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            String aStr = String.valueOf(a);
            boolean ret = true;
            if (!aStr.startsWith("10") || aStr.length() < 3) {
                ret = false;
            } else {
                String suffix = aStr.substring(2);
                if (suffix.startsWith("000") || suffix.startsWith("00") || suffix.startsWith("0")) {
                    ret = false;
                } else {
                    int exp = Integer.parseInt(suffix);
                    if (exp == 1) {
                        ret = false;
                    }
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
