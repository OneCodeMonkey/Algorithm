// AC: 670 ms 
// Memory: 13100 KB
// find max and min, and count combinations of them.
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_459B_Pashmak_and_Flowers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0, minVal = Integer.MAX_VALUE, maxVal = 0;
        int[] record = new int[n];
        long ret = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            minVal = Math.min(minVal, a);
            maxVal = Math.max(maxVal, a);
            record[pos++] = a;
            count.merge(a, 1, Integer::sum);
        }
        if (minVal == maxVal) {
            ret = (long) n * (n - 1) / 2;
        } else {
            ret = (long) count.get(maxVal) * count.get(minVal);
        }

        System.out.println((maxVal - minVal) + " " + ret);
    }
}
