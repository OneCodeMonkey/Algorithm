// AC: 404 ms 
// Memory: 0 KB
// greedy
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_149A_Business_trip {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt(), pos = 0, curSum = 0;
        int[] months = new int[12];
        for (int i = 0; i < 12; i++) {
            months[pos++] = sc.nextInt();
        }
        if (k == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(months);
        for (int i = 11; i >= 0; i--) {
            curSum += months[i];
            if (curSum >= k) {
                System.out.println(12 - i);
                return;
            }
        }
        System.out.println(-1);
    }
}
