// AC: 311 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1622A_Construct_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l1 = sc.nextInt(), l2 = sc.nextInt(), l3 = sc.nextInt();
            int[] arr = new int[]{l1, l2, l3};
            Arrays.sort(arr);
            if (arr[2] == arr[0] + arr[1]) {
                System.out.println("YES");
            } else if (arr[0] == arr[1] && arr[2] % 2 == 0) {
                System.out.println("YES");
            } else if (arr[2] == arr[1] && arr[0] % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
