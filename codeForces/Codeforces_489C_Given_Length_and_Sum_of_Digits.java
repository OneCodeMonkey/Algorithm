// AC: 202 ms 
// Memory: 0 KB
// Think carefully.
// T:O(m), S:O(m)
// 
import java.util.Scanner;

public class Codeforces_489C_Given_Length_and_Sum_of_Digits {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt(), s = sc.nextInt();
        if (s > 9 * m) {
            System.out.println("-1 -1");
        } else if (s < 1) {
            if (m > 1) {
                System.out.println("-1 -1");
            } else {
                System.out.println("0 0");
            }
        } else {
            StringBuilder retMax = new StringBuilder();
            int digit = 0;
            while (digit < m) {
                if (s > 9) {
                    retMax.append(9);
                    s -= 9;
                } else {
                    retMax.append(s);
                    s = 0;
                }
                digit++;
            }
            String max = retMax.toString(), min;
            if (max.charAt(max.length() - 1) == '0') {
                StringBuilder newStr = new StringBuilder();
                newStr.append(1);
                boolean flag = true;
                for (int i = m - 2; i >= 0; i--) {
                    if (flag && max.charAt(i) != '0') {
                        newStr.append(Integer.parseInt(String.valueOf(max.charAt(i))) - 1);
                        flag = false;
                    } else {
                        newStr.append(max.charAt(i));
                    }
                }
                min = newStr.toString();
            } else {
                min = retMax.reverse().toString();
            }

            System.out.println(min + " " + max);
        }
    }
}
