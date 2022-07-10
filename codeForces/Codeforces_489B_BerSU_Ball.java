// AC: 187 ms 
// Memory: 0 KB
// greedy, sorting
// T:O(mlogn + nlogn), S:O(m + n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_489B_BerSU_Ball {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), ret = 0;
        int[] arr1 = new int[n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            arr1[pos++] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        pos = 0;
        for (int i = 0; i < m; i++) {
            arr2[pos++] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int index1 = 0, index2 = 0;
        while (index1 < n && index2 < m) {
            if (Math.abs(arr1[index1] - arr2[index2]) <= 1) {
                ret++;
                index1++;
                index2++;
            } else if (arr1[index1] > arr2[index2]) {
                index2++;
            } else {
                index1++;
            }
        }

        System.out.println(ret);
    }
}
