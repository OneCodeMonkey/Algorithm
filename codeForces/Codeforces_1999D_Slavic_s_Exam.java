// AC: 437 ms 
// Memory: 1100 KB
// Greedy & String.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1999D_Slavic_s_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = sc.next(), t1 = sc.next();
            int len1 = s1.length(), len2 = t1.length(), pos = 0;
            boolean flag = false;
            if (len1 >= len2) {
                StringBuilder ret = new StringBuilder();
                for (int j = 0; j < len1; j++) {
                    if (pos == len2) {
                        ret.append(s1.charAt(j) == '?' ? 'a' : s1.charAt(j));
                    } else {
                        if (s1.charAt(j) == '?' || s1.charAt(j) == t1.charAt(pos)) {
                            pos++;
                            ret.append(t1.charAt(pos - 1));
                        } else {
                            ret.append(s1.charAt(j));
                        }
                    }
                }
                if (pos == len2) {
                    flag = true;
                    s1 = ret.toString();
                }
            }

            if (flag) {
                System.out.println("YES");
                System.out.println(s1);
            } else {
                System.out.println("NO");
            }
        }
    }
}
