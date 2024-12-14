// AC: 296 ms 
// Memory: 900 KB
// String.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2008B_Square_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), sqrtN = (int) Math.sqrt(n);
            String s = sc.next();
            boolean ret = false;
            if (sqrtN * sqrtN == n) {
                boolean flag = true;
                for (int j = 0; j < sqrtN; j++) {
                    if (!flag) {
                        break;
                    }
                    if (j == 0 || j == sqrtN - 1) {
                        for (int k = 0; k < sqrtN; k++) {
                            if (s.charAt(j * sqrtN + k) == '0') {
                                flag = false;
                                break;
                            }
                        }
                    } else {
                        if (s.charAt(j * sqrtN + 0) == '0' || s.charAt(j * sqrtN + sqrtN - 1) == '0') {
                            flag = false;
                            break;
                        }
                        for (int k = 1; k < sqrtN - 1; k++) {
                            if (s.charAt(j * sqrtN + k) == '1') {
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                ret = flag;
            }

            System.out.println(ret ? "Yes" : "No");
        }
    }
}
