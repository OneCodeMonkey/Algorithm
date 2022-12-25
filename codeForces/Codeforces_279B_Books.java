// AC: 592 ms 
// Memory: 0 KB
// Two-pointer Or Monotone stack.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_279B_Books {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), t = sc.nextInt(), pos = 0;
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            record[pos++] = a;
        }

        int sum = 0, left = 0, right = 0, ret = 0;
        while (right < n) {
            sum += record[right];
            if (sum <= t) {
                ret = Math.max(ret, right - left + 1);
            } else {
                while (sum > t) {
                    sum -= record[left];
                    left++;
                }
            }
            right++;
        }
        System.out.println(ret);
    }
}
