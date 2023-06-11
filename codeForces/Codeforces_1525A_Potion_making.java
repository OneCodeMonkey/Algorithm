// AC: 170 ms 
// Memory: 0 KB
// Brute-force, find largest common divider of k and 100.
// T:O(t * n), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1525A_Potion_making {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(), ret = 100;
            if (100 % k == 0) {
                ret = 100 / k;
            } else {
                for (int j = k / 2; j >= 2; j--) {
                    if (k % j == 0 && 100 % j == 0) {
                        ret = 100 / j;
                        break;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
