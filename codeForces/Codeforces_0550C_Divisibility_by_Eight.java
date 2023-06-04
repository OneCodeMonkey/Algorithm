// AC: 202 ms 
// Memory: 0 KB
// Brute-force
// T:O(n^3), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_0550C_Divisibility_by_Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length(), retNumber = 0;
        boolean ret = false;
        for (int i = 0; i < len; i++) {
            char c1 = n.charAt(i);
            if (c1 == '0' || c1 == '8') {
                ret = true;
                retNumber = c1 - '0';
                break;
            }
            for (int j = i + 1; j < len; j++) {
                char c2 = n.charAt(j);
                int number1 = ((c1 - '0') * 10 + (c2 - '0'));
                if (number1 % 8 == 0) {
                    ret = true;
                    retNumber = number1;
                    break;
                }
                for (int k = j + 1; k < len; k++) {
                    char c3 = n.charAt(k);
                    int number2 = ((c1 - '0') * 100 + (c2 - '0') * 10 + (c3 - '0'));
                    if (number2 % 8 == 0) {
                        ret = true;
                        retNumber = number2;
                        break;
                    }
                }
            }
        }

        System.out.println(ret ? "YES" : "NO");
        if (ret) {
            System.out.println(retNumber);
        }
    }
}
