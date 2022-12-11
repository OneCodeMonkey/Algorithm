// AC: 218 ms 
// Memory: 0 KB
// Greedy: Delete all the elements which is not smallest. if all elements are smallest, then cannot delete anyone.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1529A_Eshag_Loves_Big_Arrays {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), minVal = Integer.MAX_VALUE;
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                minVal = Math.min(minVal, a);
                count.merge(a, 1, Integer::sum);
            }
            int minValCount = count.get(minVal);
            System.out.println(minValCount == n ? 0 : n - minValCount);
        }
    }
}
