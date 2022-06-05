// AC: 1138 ms	
// Memory: 6300 KB
// array, count smaller elements
// T:O(max(n, max(xi))), S:O(max(n, max(xi)))
// 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_706B_Interesting_drink {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0, minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            prices[pos++] = x;
            minVal = Math.min(minVal, x);
            maxVal = Math.max(maxVal, x);
        }
        HashMap<Integer, Integer> record = new HashMap<>();
        Arrays.sort(prices);
        for (int i = 0; i < n; i++) {
            record.put(prices[i], i + 1);
        }
        int[] smallerCount = new int[maxVal + 1];
        int cur = -1;
        for (int i = 0; i <= maxVal; i++) {
            if (record.containsKey(i)) {
                smallerCount[i] = record.get(i);
                cur = i;
            } else {
                if (cur != -1) {
                    smallerCount[i] = record.get(cur);
                }
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            System.out.println(smallerCount[Math.min(maxVal, m)]);
        }
    }
}
