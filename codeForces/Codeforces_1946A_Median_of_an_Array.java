// AC: 702 ms 
// Memory: 1000 KB
// Sorting.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1946A_Median_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 1;
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int medium = arr[(n - 1) / 2];
            for (int j = (n - 1) / 2 + 1; j < n; j++) {
                if (arr[j] != medium) {
                    break;
                }
                ret++;
            }

            System.out.println(ret);
        }
    }
}
