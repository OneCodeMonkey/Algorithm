// AC: 249 ms 
// Memory: 0 KB
// Sort.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1843A_Sasha_and_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < n / 2; j++) {
                int diff = arr[n - 1 - j] - arr[j];
                if (diff == 0) {
                    break;
                }
                ret += diff;
            }

            System.out.println(ret);
        }
    }
}
