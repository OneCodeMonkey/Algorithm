// AC: 358 ms 
// Memory: 1300 KB
// Discuss by situations.
// T:O(t), S:O(t)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1881B_Three_Threadlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), maxOccurTime = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[]{a, b, c};
            Arrays.sort(arr);
            boolean ret = false;
            if ((long) arr[1] * 4 < arr[2]) {
                ret = false;
            } else {
                if (arr[0] == arr[2]) {
                    ret = true;
                } else if (arr[0] == arr[1]) {
                    ret = (arr[2] == (arr[0] * 2)) || (arr[2] == (arr[0] * 3L)) || (arr[2] == (arr[0] * 4L));
                } else if (arr[1] == arr[2]) {
                    ret = arr[1] == (arr[0] * 2);
                } else {
                    ret = (arr[1] == (arr[0] * 2)) && (arr[2] == (arr[0] * 3L));
                }
            }

            System.out.println(ret ? "YES" : "NO");
        }
    }
}
