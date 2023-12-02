// AC: 249 ms 
// Memory: 0 KB
// Constructive: in worst case, we just need to repeat n times for m length sequences is ok.
// T:O(sum(ni * ki)), S:O(max(ki))
// 
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_1348B_Phoenix_and_Beauty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            HashSet<Integer> record = new HashSet<>();
            List<Integer> smallest = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (!record.contains(a)) {
                    record.add(a);
                    smallest.add(a);
                }
            }
            if (record.size() > k) {
                System.out.println(-1);
            } else {
                System.out.println(n * k);
                for (int j = smallest.size(); j <= k; j++) {
                    smallest.add(1);
                }
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    for (int r = 0; r < k; r++) {
                        sb.append(smallest.get(r));
                        if (r != n - 1) {
                            sb.append(" ");
                        }
                    }
                    if (j != n - 1) {
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}
