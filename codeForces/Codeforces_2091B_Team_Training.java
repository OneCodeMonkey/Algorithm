// Time: 702 ms 
// Memory: 700 KB
// Greedy.
// T:O(sum(nilogni)), S:O(max(ni))
//
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Codeforces_2091B_Team_Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), x = sc.nextInt();
            int ret = 0, curMin = Integer.MAX_VALUE, curCount = 0;
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[j] = a;
            }
            Arrays.sort(arr, Comparator.reverseOrder());
            for (int j = 0; j < n; j++) {
                if (curCount == 0) {
                    curCount = 1;
                    curMin = arr[j];
                    if (curMin >= x) {
                        ret++;
                        curCount = 0;
                        curMin = Integer.MAX_VALUE;
                    }
                } else {
                    curCount++;
                    curMin = Math.min(curMin, arr[j]);
                    if (curCount * curMin >= x) {
                        ret++;
                        curCount = 0;
                        curMin = Integer.MAX_VALUE;
                    }
                }
            }

            System.out.println(ret);
        }
    }
}
