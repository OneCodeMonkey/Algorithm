// AC: 389 ms 
// Memory: 0 KB
// Map or sort, if sort the space complexity is O(logn)
// T:O(n), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0768A_Oath_of_the_Night_s_Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE, maxVal = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            minVal = Math.min(minVal, a);
            maxVal = Math.max(maxVal, a);
            count.merge(a, 1, Integer::sum);
        }

        System.out.println(n - (minVal == maxVal ? n : count.get(minVal) + count.get(maxVal)));
    }
}
