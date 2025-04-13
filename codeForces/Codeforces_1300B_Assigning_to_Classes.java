// AC: 702 ms  
// Memory: 1400 KB
// sort & greedy.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1300B_Assigning_to_Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            int[] arr = new int[2 * n];
            for (int j = 0; j < 2 * n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            Arrays.sort(arr);

            System.out.println(arr[n] - arr[n - 1]);
        }
    }
}
