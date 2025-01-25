// Time: 811 ms 
// Memory: 15600 KB
// .
// T:O(sum(n^2)), S:O(max(n^2))
// 
import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_1955B_Progressive_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), minVal = Integer.MAX_VALUE;
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < n * n; j++) {
                int b = sc.nextInt();
                minVal = Math.min(minVal, b);
                record.merge(b, 1, Integer::sum);
            }
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (!flag) {
                    break;
                }
                for (int k = 0; k < n; k++) {
                    int elem = minVal + j * c + k * d;
                    if (!record.containsKey(elem) || record.get(elem) == 0) {
                        flag = false;
                        break;
                    }
                    record.merge(elem, -1, Integer::sum);
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
