// AC: 343 ms 
// Memory: 0 KB
// Since the element appears in pairwise, just print every distinct number is enough.
// T:O(sum(ni)), S:O(max(ni))
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1385B_Restore_the_Permutation_by_Merger {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashSet<Integer> record = new HashSet<>();
            for (int j = 0; j < 2 * n; j++) {
                int a = sc.nextInt();
                if (!record.contains(a)) {
                    System.out.print(a);
                    record.add(a);
                    if (record.size() != n) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
