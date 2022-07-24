// AC: 326 ms 
// Memory: 0 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1535A_Fair_Playoff {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt(),
                    win1 = Math.max(s1, s2), win2 = Math.max(s3, s4);
            int[] arr = new int[]{s1, s2, s3, s4};
            Arrays.sort(arr);
            if ((win1 != arr[2] && win1 != arr[3]) || (win2 != arr[2] && win2 != arr[3])) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
