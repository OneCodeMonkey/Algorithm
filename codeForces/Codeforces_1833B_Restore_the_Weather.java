// AC: 857 ms 
// Memory: 36400 KB
// Greedy: sort.
// T:O(nlogn), S:O(n)
// 
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Codeforces_1833B_Restore_the_Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            Integer[] arrayA = new Integer[n], arrayB = new Integer[n], arrayACopy = new Integer[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arrayA[j] = a;
                arrayACopy[j] = a;
            }
            for (int j = 0; j < n; j++) {
                arrayB[j] = sc.nextInt();
            }
            Arrays.sort(arrayACopy);
            Arrays.sort(arrayB);
            HashMap<Integer, Queue<Integer>> record = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (!record.containsKey(arrayACopy[j])) {
                    record.put(arrayACopy[j], new ArrayDeque<>());
                }
                record.get(arrayACopy[j]).add(arrayB[j]);
            }
            StringBuilder ret = new StringBuilder();
            for (int j = 0; j < n; j++) {
                Queue<Integer> arr = record.get(arrayA[j]);
                ret.append(arr.poll());
                if (j != n - 1) {
                    ret.append(" ");
                }
            }
            System.out.println(ret);
        }
    }
}
