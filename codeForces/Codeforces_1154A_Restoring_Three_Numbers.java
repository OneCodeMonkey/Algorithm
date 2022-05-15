// AC: 217 ms 
// Memory: 0 KB
// .
// T:O(1), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1154A_Restoring_Three_Numbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int[] arr = new int[]{a, b, c, d};
        Arrays.sort(arr);
        System.out.println((arr[3] - arr[0]) + " " + (arr[3] - arr[1]) + " " + (arr[3] - arr[2]));
    }
}
