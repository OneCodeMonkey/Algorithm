// AC: 1046 ms 
// Memory: 2700 KB
// Sort.
// T:O(sum(k * logk)), S:O(max(k))
//
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1593C_Save_More_Mice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), cur = 0, ret = 0;
            int[] arr = new int[k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = k - 1; j >= 0; j--) {
                if (arr[j] > cur) {
                    cur += n - arr[j];
                    ret++;
                } else {
                    break;
                }
            }

            System.out.println(ret);
        }
    }
}
