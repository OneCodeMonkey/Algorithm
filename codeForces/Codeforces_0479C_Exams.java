// AC: 218 ms 
// Memory: 0 KB
// Greedy & sort.
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_0479C_Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), ret = 0;
        int[][] arr = new int[t][2];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            arr[i] = new int[]{a, b};
        }
        Arrays.sort(arr, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));
        for (int[] item : arr) {
            if (ret == 0) {
                ret = item[1];
            } else {
                if (item[1] >= ret) {
                    ret = item[1];
                } else {
                    ret = item[0];
                }
            }
        }

        System.out.println(ret);
    }
}
