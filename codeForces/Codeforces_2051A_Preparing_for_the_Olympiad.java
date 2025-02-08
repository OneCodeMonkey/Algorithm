// Time: 452 ms 
// Memory: 900 KB
// Greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_2051A_Preparing_for_the_Olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] arr1 = new int[n], arr2 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }
            for (int j = 0; j < n - 1; j++) {
                if (arr1[j] > arr2[j + 1]) {
                    ret += arr1[j] - arr2[j + 1];
                }
            }
            ret += arr1[n - 1];

            System.out.println(ret);
        }
    }
}
