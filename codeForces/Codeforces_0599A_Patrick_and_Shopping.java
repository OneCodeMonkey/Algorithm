// AC: 187 ms 
// Memory: 0 KB
// All possible path is 2(d1 + d2), 2(d1 + d3), 2d(d2 + d3), (d1 + d2 + d3)
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_0599A_Patrick_and_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        int[] arr = new int[]{d1, d2, d3};
        Arrays.sort(arr);
        int ret = arr[0] + arr[1] <= arr[2] ? 2 * (arr[0] + arr[1]) : arr[0] + arr[1] + arr[2];
        System.out.println(ret);
    }
}
