// AC: 326 ms 
// Memory: 300 KB
// Greedy. From the left side, if the behind substring is CVCC, then must spilit CVC first,
// otherwise must split CV first.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1915D_Unnatural_Language_Processing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; ) {
                if (j + 3 < n) {
                    if (Arrays.asList('a', 'e').contains(s.charAt(j + 3))) {
                        ret.append(s.charAt(j));
                        ret.append(s.charAt(j + 1));
                        ret.append('.');
                        j += 2;
                    } else {
                        ret.append(s.charAt(j));
                        ret.append(s.charAt(j + 1));
                        ret.append(s.charAt(j + 2));
                        ret.append('.');
                        j += 3;
                    }
                } else {
                    ret.append(s.charAt(j));
                    ret.append(s.charAt(j + 1));
                    if (j + 2 < n) {
                        ret.append(s.charAt(j + 2));
                    }
                    break;
                }

            }
            System.out.println(ret);
        }
    }
}
