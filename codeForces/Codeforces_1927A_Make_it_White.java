// AC: 280 ms 
// Memory: 100 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1927A_Make_it_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), left = -1, right = -1;
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    left = j;
                    break;
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(j) == 'B') {
                    right = j;
                    break;
                }
            }

            System.out.println(left == -1 ? 0 : (right - left + 1));
        }
    }
}
