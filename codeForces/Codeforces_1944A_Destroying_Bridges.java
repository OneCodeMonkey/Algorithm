// Time: 249 ms 
// Memory: 1000 KB
// Graph.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1944A_Destroying_Bridges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), ret = 1;
            if (k < n - 1) {
                ret = n;
            }

            System.out.println(ret);
        }
    }
}
