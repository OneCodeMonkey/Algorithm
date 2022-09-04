// AC: 577 ms 
// Memory: 200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1385A_Three_Pairwise_Maximums {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            int[] arr = new int[]{x, y, z};
            Arrays.sort(arr);
            if (arr[1] != arr[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (arr[0] == arr[1]) {
                    System.out.println(arr[1] + " " + arr[1] + " " + arr[1]);
                } else {
                    System.out.println(arr[0] + " " + arr[0] + " " + arr[1]);
                }
            }
        }
    }
}
