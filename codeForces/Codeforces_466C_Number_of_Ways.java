// AC: 935 ms 
// Memory: 60300 KB
// dp & hashmap
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_466C_Number_of_Ways {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), pos = 0;
        long ret = 0, totalSum = 0, curSum = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[pos++] = a;
            totalSum += (long) a;
        }
        if (n >= 3 && totalSum % 3 == 0) {
            int countThird = 0;
            for (int i = 0; i < n; i++) {
                curSum += arr[i];
                if (3 * curSum == totalSum) {
                    countThird++;
                }
                count.put(i, countThird);
            }
            curSum = 0;
            for (int i = n - 1; i >= 2; i--) {
                curSum += arr[i];
                if (3 * curSum == totalSum) {
                    ret += count.get(i - 2);
                }
            }
        }

        System.out.println(ret);
    }
}
