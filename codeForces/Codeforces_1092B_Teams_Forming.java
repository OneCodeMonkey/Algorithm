// AC: 202 ms 
// Memory: 0 KB
// Greedy.
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1092B_Teams_Forming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i += 2) {
            ret += arr[i + 1] - arr[i];
        }

        System.out.println(ret);
    }
}
