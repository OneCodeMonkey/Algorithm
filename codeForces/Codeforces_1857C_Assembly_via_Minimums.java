// AC: 1187 ms 
// Memory: 1600 KB
// Sort. Output the n-1 smallest element with gap (n-1), (n-2), .. , 1 in the sorted sequence.
// Then add a biggest element int the end.
// T:O(sum(n*(n-1)/2 * log(n*(n-1)/2))), S:O(max(n*(n-1)/2))
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1857C_Assembly_via_Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), numCount = n * (n - 1) / 2;
            int[] arr = new int[numCount];
            for (int j = 0; j < numCount; j++) {
                int b = sc.nextInt();
                arr[j] = b;
            }
            Arrays.sort(arr);
            StringBuilder ret = new StringBuilder();
            int pos = 0, step = n - 1;
            while (step > 0) {
                ret.append(arr[pos]);
                ret.append(" ");
                pos += step--;
            }
            ret.append(1_000_000_000);

            System.out.println(ret);
        }
    }
}
