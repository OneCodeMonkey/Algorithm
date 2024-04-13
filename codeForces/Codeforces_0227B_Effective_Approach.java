// AC: 1436 ms 
// Memory: 6600 KB
// Hashmap.
// T:O(n + m), S:O(n)
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_0227B_Effective_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            record.put(a, i + 1);
        }
        int m = sc.nextInt();
        long ret1 = 0, ret2 = 0;
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int index = record.get(b);
            ret1 += index;
            ret2 += n - index + 1;
        }
        System.out.println(ret1 + " " + ret2);
    }
}
