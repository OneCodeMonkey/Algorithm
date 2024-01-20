// Tag: Graph
// AC: 124 ms 
// Memory: 0 KB
// Using an array recording pointing target, and check cycle.
// T:O(n), S:O(n)
// 
import java.util.Scanner;

public class Codeforces_0939A_Love_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] record = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            record[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if (record[record[record[i]]] == i) {
                flag = true;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
