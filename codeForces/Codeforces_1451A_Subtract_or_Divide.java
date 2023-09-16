// AC: 234 ms 
// Memory: 0 KB
// Greedy. If num is even, then can always make it to 2 in one step, so step is at most 2.
// If num is odd, first make it even, then use above, so step is at most 3.
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1451A_Subtract_or_Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), ret = 0;
            if (n > 1) {
                if (n % 2 == 0) {
                    ret = n == 2 ? 1 : 2;
                } else {
                    ret = n == 3 ? 2 : 3;
                }
            }
            System.out.println(ret);
        }
    }
}
