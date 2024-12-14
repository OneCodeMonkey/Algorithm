// AC: 249 ms 
// Memory: 800 KB
// Constructive.
// T:O(sum(ni^2)), S:O(max(ni))
// 
import java.util.Scanner;

public class Codeforces_1621A_Stable_Arrangement_of_Rooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), index = 0;
            if (k > (n + 1) / 2) {
                System.out.println(-1);
            } else {
                for (int j = 0; j < n; j++) {
                    String row = ".".repeat(n);
                    if (j % 2 == 1) {
                        System.out.println(row);
                        continue;
                    }
                    if (k > 0) {
                        if (index == 0) {
                            row = "R" + ".".repeat(n - 1);
                        } else {
                            row = ".".repeat(index) + "R" + ".".repeat(n - 1 - index);
                        }
                        index += 2;
                        k--;
                    }
                    System.out.println(row);
                }
            }
        }
    }
}
