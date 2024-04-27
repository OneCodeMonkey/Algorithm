// AC: 718 ms 
// Memory: 2100 KB
// Greedy & sort.
// T:O(sum(ni * logni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1537C_Challenging_Cliffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), diff = Integer.MAX_VALUE, pivotIndex = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < n - 1; j++) {
                if (arr[j + 1] - arr[j] < diff) {
                    diff = arr[j + 1] - arr[j];
                    pivotIndex = j;
                }
                if (diff == 0) {
                    break;
                }
            }
            StringBuilder ret = new StringBuilder();
            ret.append(arr[pivotIndex]);
            for (int j = pivotIndex + 2; j < n; j++) {
                ret.append(" ");
                ret.append(arr[j]);
            }
            for (int j = 0; j < pivotIndex; j++) {
                ret.append(" ");
                ret.append(arr[j]);
            }
            ret.append(" ");
            ret.append(arr[pivotIndex + 1]);


            System.out.println(ret);
        }
    }
}
