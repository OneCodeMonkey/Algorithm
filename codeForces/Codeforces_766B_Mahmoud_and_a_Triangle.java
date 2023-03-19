// AC: 343 ms 
// Memory: 0 KB
// Sort and judge continous 3-size subarrays.
// T:O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_766B_Mahmoud_and_a_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            record[i] = a;
        }
        Arrays.sort(record);
        boolean flag = false;
        for (int i = 0; i < n - 2; i++) {
            if (record[i] + record[i + 1] > record[i + 2]) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
