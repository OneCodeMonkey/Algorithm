// AC: 405 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Codeforces_1490B_Balanced_Remainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), remain0 = 0, remain1 = 0, remain2 = 0, ret = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a % 3 == 0) {
                    remain0++;
                } else if (a % 3 == 1) {
                    remain1++;
                } else {
                    remain2++;
                }
            }
            int[][] arr = new int[][]{new int[]{remain0, 0}, new int[]{remain1, 1}, new int[]{remain2, 2}};
            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            if (arr[2][0] != n / 3) {
                if (arr[1][0] >= n / 3) {
                    ret += (arr[2][0] - n / 3) * (arr[2][1] > arr[0][1] ? (arr[0][1] + 3 - arr[2][1]) : (arr[0][1] - arr[2][1])) +
                            (arr[1][0] - n / 3) * (arr[1][1] > arr[0][1] ? (arr[0][1] + 3 - arr[1][1]) : (arr[0][1] - arr[1][1]));
                } else {
                    ret += (n / 3 - arr[1][0]) * (arr[2][1] > arr[1][1] ? (arr[1][1] + 3 - arr[2][1]) : (arr[1][1] - arr[2][1])) +
                            (n / 3 - arr[0][0]) * (arr[2][1] > arr[0][1] ? (arr[0][1] + 3 - arr[2][1]) : (arr[0][1] - arr[2][1]));
                }
            }

            System.out.println(ret);
        }
    }
}
