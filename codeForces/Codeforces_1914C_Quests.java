// AC: 843 ms 
// Memory: 1200 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1914C_Quests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), curMax = 0, curSum = 0, ret = 0;
            int[] arr1 = new int[n], arr2 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }
            for (int j = 0; j < k && j < n; j++) {
                curMax = Math.max(curMax, arr2[j]);
                curSum += arr1[j];
                ret = Math.max(ret, curSum + (k - j - 1) * curMax);
            }

            System.out.println(ret);
        }
    }
}
