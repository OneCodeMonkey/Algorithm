// AC: 233 ms 
// Memory: 0 KB
// Sort.
// T:O(sum(nlogn)), S:O(max(n))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1487A_Arena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int countMin = 0;
            for (int j : arr) {
                if (j == arr[0]) {
                    countMin++;
                } else {
                    break;
                }
            }

            System.out.println(n - countMin);
        }
    }
}
