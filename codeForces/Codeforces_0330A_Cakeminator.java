// AC: 374 ms 
// Memory: 0 KB
// .
// T:O(m * n), S:O(m + n)
// 
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_0330A_Cakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), ret = 0;
        HashSet<Integer> rows = new HashSet<>(), cols = new HashSet<>();
        for (int i = 0; i < r; i++) {
            String row = sc.next();
            for (int j = 0; j < c; j++) {
                if (row.charAt(j) == 'S') {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        System.out.println(r * c - rows.size() * cols.size());
    }
}
