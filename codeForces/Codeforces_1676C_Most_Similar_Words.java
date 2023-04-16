// AC: 248 ms 
// Memory: 0 KB
// Brute-force
// T:O(sum(ni^2 * ki)), S:O(max(ni)), ki = si.length
// 
import java.util.Scanner;

public class Codeforces_1676C_Most_Similar_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = Integer.MAX_VALUE;
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                String si = sc.next();
                arr[j] = si;
            }
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    ret = Math.min(ret, countDiff(arr[j], arr[k]));
                }
            }

            System.out.println(ret);
        }
    }

    private static int countDiff(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            diff += Math.abs(s1.charAt(i) - s2.charAt(i));
        }
        return diff;
    }
}
