// AC: 202 ms 
// Memory: 0 KB
// Deque.
// T:O(n), S:O(m)
// 
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Codeforces_450A_Jzzhu_and_Children {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
        Deque<List<Integer>> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (m < a) {
                q.offer(Arrays.asList(a - m, i + 1));
            }
        }
        if (q.isEmpty()) {
            ret = n;
        } else {
            while (!q.isEmpty()) {
                List<Integer> top = q.poll();
                if (top.get(0) > m) {
                    q.offer(Arrays.asList(top.get(0) - m, top.get(1)));
                }
                ret = top.get(1);
            }
        }

        System.out.println(ret);
    }
}
