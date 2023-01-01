// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(logn), S:O(logn)
// 
import java.util.Scanner;

public class Codeforces_320A_Magic_Numbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int digit = n % 10;
            sb.append(digit);
            n /= 10;
        }
        String numberStr = sb.reverse().toString();
        int len = numberStr.length();
        for (int i = 0; i < len; i++) {
            if (i < len - 2) {
                if ("144".equals(numberStr.substring(i, i + 3))) {
                    i += 2;
                } else if ("14".equals(numberStr.substring(i, i + 2))) {
                    i += 1;
                } else if ('1' == numberStr.charAt(i)) {
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (i < len - 1) {
                if ("14".equals(numberStr.substring(i, i + 2))) {
                    i += 1;
                } else if ('1' == numberStr.charAt(i)) {
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                if ('1' == numberStr.charAt(i)) {
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
