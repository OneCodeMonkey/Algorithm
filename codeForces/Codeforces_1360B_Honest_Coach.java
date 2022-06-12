// AC: 264 ms 
// Memory: 0 KB
// find the minimum diff of sorted array, for example, A and B, then put elements below A and A to one array, 
// put elements above B and B into another, then it's the answer.
// T:O(t * nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1360B_Honest_Coach {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), pos = 0, minDiff = Integer.MAX_VALUE;
            int[] record = new int[n];
            for (int j = 0; j < n; j++) {
                record[pos++] = sc.nextInt();
            }
            Arrays.sort(record);
            for (int j = 0; j < n - 1; j++) {
                minDiff = Math.min(minDiff, record[j + 1] - record[j]);
            }
            System.out.println(minDiff);
        }
    }
}
