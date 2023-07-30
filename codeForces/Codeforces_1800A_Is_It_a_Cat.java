// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1800A_Is_It_a_Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ret = true;
            if (n < 4 || (s.charAt(0) != 'm' && s.charAt(0) != 'M')) {
                ret = false;
            } else {
                char prev = s.charAt(0);
                for (int j = 1; j < n; j++) {
                    char c = s.charAt(j);
                    if (j == n - 1 && (c != 'w' && c != 'W')) {
                        ret = false;
                        break;
                    }
                    switch (prev) {
                        case 'm':
                        case 'M':
                            if (!(c == 'm' || c == 'M' || c == 'e' || c == 'E')) {
                                ret = false;
                            }
                            break;
                        case 'e':
                        case 'E':
                            if (!(c == 'e' || c == 'E' || c == 'o' || c == 'O')) {
                                ret = false;
                            }
                            break;
                        case 'o':
                        case 'O':
                            if (!(c == 'o' || c == 'O' || c == 'w' || c == 'W')) {
                                ret = false;
                            }
                            break;
                        case 'w':
                        case 'W':
                            if (c != 'w' && c != 'W') {
                                ret = false;
                            }
                            break;
                        default:
                    }
                    if (!ret) {
                        break;
                    }
                    prev = c;
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
