// AC: 358 ms 
// Memory: 0 KB
// .
// T:O(m * n), S:O(1)
// 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_707A_Brain_s_Photos {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        HashSet<String> color = new HashSet<>(Arrays.asList("W", "G", "B"));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!color.contains(sc.next())) {
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");
    }
}
