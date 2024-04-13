// AC: 546 ms 
// Memory: 1300 KB
// Greedy & Sort.
// T: O(nlogn), S:O(n)
// 
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_0545D_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ret = 0;
        int[] arr = new int[n];
        long sumWait = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] >= sumWait) {
                ret++;
            } else {
                continue;
            }
            sumWait += arr[i];
        }

        System.out.println(ret);
    }
}
