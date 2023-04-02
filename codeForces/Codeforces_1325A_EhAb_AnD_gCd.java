// AC: 202 ms 
// Memory: 0 KB
// Greedy: just find 1 and x - 1 are ok.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1325A_EhAb_AnD_gCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            System.out.println("1 " + (x - 1));
        }
    }
}
