// AC: 202 ms 
// Memory: 0 KB
// greedy
// T:O(t * nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1353B_Two_Arrays_And_Swaps {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), pos = 0, sumA = 0;
            int[] arrayA = new int[n];
            Integer[] arrayB = new Integer[n];
            for (int j = 0; j < n; j++) {
                int aItem = sc.nextInt();
                arrayA[pos++] = aItem;
                sumA += aItem;
            }
            pos = 0;
            for (int j = 0; j < n; j++) {
                arrayB[pos++] = sc.nextInt();
            }
            Arrays.sort(arrayA);
            Arrays.sort(arrayB, (a, b) -> (b - a));
            pos = 0;
            for (int j = 0; j < n && pos < k; j++, pos++) {
                if (arrayB[j] > arrayA[j]) {
                    sumA += arrayB[j] - arrayA[j];
                } else {
                    break;
                }
            }

            System.out.println(sumA);
        }
    }
}
