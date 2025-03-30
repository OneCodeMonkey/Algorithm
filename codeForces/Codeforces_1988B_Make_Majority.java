// Time: 405 ms 
// Memory: 1300 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
//
import java.util.Scanner;

public class Codeforces_1988B_Make_Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), count0 = 0, count1 = 0;
            String s = sc.next();
            char prev = ' ';
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (prev == ' ') {
                    int k = c == '0' ? count0++ : count1++;
                } else {
                    if (prev != c) {
                        int k = c == '0' ? count0++ : count1++;
                    } else if (c == '1') {
                        count1++;
                    }
                }
                prev = c;
            }

            System.out.println(count1 > count0 ? "YES" : "NO");
        }
    }
}
