// AC: 296 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1742A_Sum {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[]{a, b, c};
            Arrays.sort(arr);
            System.out.println(arr[2] - arr[1] == arr[0] ? "YES" : "NO");
        }
    }
}
