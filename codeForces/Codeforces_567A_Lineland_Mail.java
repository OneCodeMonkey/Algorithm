// AC: 1809 ms 
// Memory: 0 KB
// .
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_567A_Lineland_Mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), minVal = 0, maxVal = 0;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if (i == 0) {
                minVal = arr[i + 1] - arr[i];
                maxVal = arr[t - 1] - arr[i];
            } else if (i == t - 1) {
                minVal = arr[i] - arr[i - 1];
                maxVal = arr[i] - arr[0];
            } else {
                minVal = Math.min(arr[i + 1] - arr[i], arr[i] - arr[i - 1]);
                maxVal = Math.max(arr[t - 1] - arr[i], arr[i] - arr[0]);
            }

            System.out.printf("%d %d\n", minVal, maxVal);
        }
    }
}
