// AC: 233 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1992A_Only_Pluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[]{a, b, c};
            for (int j = 0; j < 5; j++) {
                Arrays.sort(arr);
                arr[0]++;
            }
            System.out.println(arr[0] * arr[1] * arr[2]);
        }
    }
}
