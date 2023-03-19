// AC: 343 ms 
// Memory: 0 KB
// Two pointers.
// T:O(sum(si.length())), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1354B_Ternary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int ret = Integer.MAX_VALUE, left = 0, right = 0, count1 = 0, count2 = 0, count3 = 0;
            if (s.charAt(0) == '1') {
                count1++;
            } else if (s.charAt(0) == '2') {
                count2++;
            } else {
                count3++;
            }
            while (left <= s.length() - 3 && right <= s.length() - 1) {
                if (count1 < 1 || count2 < 1 || count3 < 1) {
                    right++;
                    if (right > s.length() - 1) {
                        break;
                    }
                    if (s.charAt(right) == '1') {
                        count1++;
                    } else if (s.charAt(right) == '2') {
                        count2++;
                    } else {
                        count3++;
                    }
                } else {
                    ret = Math.min(ret, right - left + 1);
                    if (s.charAt(left) == '1') {
                        count1--;
                    } else if (s.charAt(left) == '2') {
                        count2--;
                    } else {
                        count3--;
                    }
                    left++;
                }
            }

            System.out.println(ret == Integer.MAX_VALUE ? 0 : ret);
        }
    }
}
