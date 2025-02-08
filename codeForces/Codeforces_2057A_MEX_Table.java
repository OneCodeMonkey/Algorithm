// AC: 280 ms 
// Memory: 1000 KB
// Greedy.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_2057A_MEX_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), ret = Math.max(n, m) + 1;
            System.out.println(ret);
        }
    }
}
