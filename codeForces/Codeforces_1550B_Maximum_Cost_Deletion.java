// AC: 265 ms 
// Memory: 0 KB
// Greedy.
// T:O(sum(ni)), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_1550B_Maximum_Cost_Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), ret = 0;
            String s = sc.next();
            if (b >= 0) {
                ret = n * (a + b);
            } else {
                int countConsecutive = 1;
                for (int j = 1; j < n; j++) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        countConsecutive++;
                    }
                }
                ret = n * a + (countConsecutive / 2 + 1) * b;
            }

            System.out.println(ret);
        }
    }
}
