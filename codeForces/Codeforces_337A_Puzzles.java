// AC: Time: 342 ms 
// Memory: 0 KB
// sort
// T:O(nlogn), S:O(n)
// 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Codeforces_337A_Puzzles {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        List<Integer> record = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            record.add(sc.nextInt());
        }
        Collections.sort(record);
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            ret = Math.min(ret, record.get(n - 1 + i) - record.get(i));
        }
        System.out.println(ret);
    }
}
