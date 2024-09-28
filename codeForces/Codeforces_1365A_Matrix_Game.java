// AC: 452 ms 
// Memory: 1100 KB
// .
// T:O(sum(ni * mi)), S:O(max(ni + mi))
//
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_1365A_Matrix_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = 0;
            HashSet<Integer> rowUsed = new HashSet<>(), colUsed = new HashSet<>();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int a = sc.nextInt();
                    if (a == 1) {
                        rowUsed.add(j);
                        colUsed.add(k);
                    }
                }
            }
            ret = Math.min(n - rowUsed.size(), m - colUsed.size());

            System.out.println(ret % 2 == 0 ? "Vivek" : "Ashish");
        }
    }
}
