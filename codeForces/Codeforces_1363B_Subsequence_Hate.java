// Time : 374 ms  
// Memory:  1200 KB
// Dynamic program.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1363B_Subsequence_Hate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int len = s.length(), ret = len, count1 = 0, count0 = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    count1++;
                } else {
                    count0++;
                }
            }
            ret = Math.min(count0, count1);
            int cur1 = 0, cur0 = 0;
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) == '0') {
                    cur0++;
                    count0--;
                } else {
                    cur1++;
                    count1--;
                }
                ret = Math.min(ret, Math.min(cur0 + count1, cur1 + count0));
            }

            System.out.println(ret);
        }
    }
}
