// AC: 171 ms 
// Memory: 0 KB
// .
// T:O(sum(si.length())), S:O(max(si.length()))
// 
import java.util.Scanner;

public class Codeforces_1303A_Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int left = -1, right = -1, sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    if (left == -1) {
                        left = j;
                    }
                    right = j;
                    sum++;
                }
            }

            System.out.println(right > left ? (right - left + 1 - sum) : 0);
        }
    }
}
